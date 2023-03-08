package zhihu.C_PatternOfBehavior.C8_Strategy.Strategy;

/**
 * 首先定义一个策略接口，规定算法的同一操作
 */
public interface CalculateStrategy {

    int calculateTrafficFee(int distance);

}
