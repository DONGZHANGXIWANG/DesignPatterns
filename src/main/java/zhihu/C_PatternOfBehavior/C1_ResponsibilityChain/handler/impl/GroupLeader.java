package zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler.impl;

import zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler.BudgetHandler;

import java.util.Objects;

/**
 * 第二，实现各种处理器
 * 小组领导类
 */
public class GroupLeader implements BudgetHandler {

    private BudgetHandler nextHandler;


    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);
        if (amount < 1000) {
            System.out.println("小钱，批了！");
            return true;
        }
        System.out.println(String.format("%d超出GroupLeader权限,请更高级管理层批复", amount));
        return nextHandler.handle(amount);
    }
}
