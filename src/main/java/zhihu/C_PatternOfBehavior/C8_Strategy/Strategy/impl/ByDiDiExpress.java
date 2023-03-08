package zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl;

import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.CalculateStrategy;

public class ByDiDiExpress implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance < 3 ? 8 : (8 + (distance - 3) * 3);
    }
}
