package zhihu.C_PatternOfBehavior.C9_State.State.impl;

import zhihu.C_PatternOfBehavior.C9_State.Context.JdLogistics;
import zhihu.C_PatternOfBehavior.C9_State.State.LogisticsState;

/**
 * 第三，实现各种状态类
 * 接单状态类，其需要实现LogisticsState接口
 */
public class OrderState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商家已经接单，正在处理中...");
    }
}
