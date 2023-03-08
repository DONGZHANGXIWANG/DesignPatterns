package zhihu.C_PatternOfBehavior.C9_State.Context;

import zhihu.C_PatternOfBehavior.C9_State.State.LogisticsState;

import java.util.Objects;

/**
 * 第二，定义一个物流Context类
 * 此类持有一个LogisticsState 的引用，负责在流程中保持并切换状态
 */
public class JdLogistics {

    private LogisticsState logisticsState;

    public void setLogisticsState(LogisticsState logisticsState) {
        this.logisticsState = logisticsState;
    }

    public LogisticsState getLogisticsState() {
        return logisticsState;
    }

    public void doAction(){
        Objects.requireNonNull(logisticsState);
        logisticsState.doAction(this);
    }

}
