package zhihu.C_PatternOfBehavior.C8_Strategy;

import zhihu.C_PatternOfBehavior.C8_Strategy.Context.TrafficFeeCalculator;
import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl.ByBus;
import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl.ByDiDiExpress;
import zhihu.C_PatternOfBehavior.C8_Strategy.Strategy.impl.BySharedBicycle;

/**
 * 策略模式
 * demo场景
 * <p>
 * 2017年的2月14号，王二狗和牛翠花约好在天津之眼约定终身，二狗打扮一番后准备出发，此时问题来了：是坐公交去呢，还是打滴滴快车呢？天气看起来也不错，要不骑共享单车吧，省钱还锻炼身体。
 * 对应到编程领域就是：目前有三种策略可以实现一个特定的目的，使用何种策略取决于调用者（客户端）
 */
public class TestDemo {

    public static void main(String[] args) {
        TrafficFeeCalculator calculator = new TrafficFeeCalculator();
        System.out.println(String.format("乘坐公交车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new ByBus(), 10)));
        System.out.println(String.format("乘坐滴滴快车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new ByDiDiExpress(), 10)));
        System.out.println(String.format("骑共享单车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new BySharedBicycle(), 10)));
    }

}
