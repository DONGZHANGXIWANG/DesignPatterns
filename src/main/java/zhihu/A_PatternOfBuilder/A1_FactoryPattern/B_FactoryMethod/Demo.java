package zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.concretepizzastore.ChicagoPizzaStore;

/**
 * 工厂方法 -
 *  芝加哥披萨有专门的芝加哥商场 ChicagoPizzaStore
 *  纽约披萨有传传的纽约商场 NYStylePizzaStore
 *      再将工厂的生产流程抽象 PizzaStore
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.orderPizza("cheese");
    }

}
