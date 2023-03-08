package zhihu.C_PatternOfBehavior.C9_State.State.impl;

import zhihu.C_PatternOfBehavior.C9_State.Context.JdLogistics;
import zhihu.C_PatternOfBehavior.C9_State.State.LogisticsState;

/**
 * 出库状态类
 */
public class ProductOutState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商品已经出库...");
    }
}
