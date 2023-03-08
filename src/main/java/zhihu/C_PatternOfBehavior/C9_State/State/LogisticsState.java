package zhihu.C_PatternOfBehavior.C9_State.State;

import zhihu.C_PatternOfBehavior.C9_State.Context.JdLogistics;

/**
 * 第一，定义一个状态接口
 * 此接口定义各个状态的统一操作接口
 */
public interface LogisticsState {

    void doAction(JdLogistics context);

}
