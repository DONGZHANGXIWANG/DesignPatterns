package zhihu.C_PatternOfBehavior.C8_Strategy.Context;

import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.CalculateStrategy;


/**
 * 使用算法
 */
public class TrafficFeeCalculator {

    public int goToTianJinEye(CalculateStrategy strategy, int distance){
        return strategy.calculateTrafficFee(distance);
    }

}
