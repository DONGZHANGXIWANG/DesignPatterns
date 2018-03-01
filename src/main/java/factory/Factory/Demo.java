package factory.Factory;

import factory.Factory.concretepizzastore.ChicagoPizzaStore;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.orderPizza("cheese");
    }

}
