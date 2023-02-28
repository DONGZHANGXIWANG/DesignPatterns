package zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.concretepizzastore.ChicagoPizzaStore;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.orderPizza("cheese");
    }

}
