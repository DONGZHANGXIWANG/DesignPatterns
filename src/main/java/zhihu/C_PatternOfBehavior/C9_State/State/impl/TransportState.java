package zhihu.C_PatternOfBehavior.C9_State.State.impl;

import zhihu.C_PatternOfBehavior.C9_State.Context.JdLogistics;
import zhihu.C_PatternOfBehavior.C9_State.State.LogisticsState;

public class TransportState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("正在运输!");
    }
}
