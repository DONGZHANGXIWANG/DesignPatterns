package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizzastore.ChicagoPizzaStore;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.orderPizza("clam");

    }

}
