package factory.abstractfactory;

import factory.abstractfactory.concretepizzastore.ChicagoPizzaStore;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.orderPizza("clam");

    }

}
