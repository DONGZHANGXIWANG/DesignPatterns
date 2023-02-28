package zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory.dto.Pizza;

/**
 * 简单工厂 由 SimplePizzaFactory 直接生成
 *  调用者不关心内部实现
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        pizza.make();
    }

}
