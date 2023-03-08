package zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl;

import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.CalculateStrategy;

public class ByBus implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 10 ? 4 : 6;
    }
}
