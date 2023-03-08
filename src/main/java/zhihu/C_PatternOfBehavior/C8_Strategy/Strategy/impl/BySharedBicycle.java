package zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl;

import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.CalculateStrategy;

public class BySharedBicycle implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return 2;
    }
}
