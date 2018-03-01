package factory.Factory.concretepizzastore;

import factory.Factory.Pizza;
import factory.Factory.PizzaStore;
import factory.Factory.concretepizza.Chicago.ChicagoStyleCeesePizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCeesePizza();
        }else {
            return null;
        }
    }
}
