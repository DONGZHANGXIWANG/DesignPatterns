package factory.Factory.concretepizzastore;

import factory.Factory.Pizza;
import factory.Factory.PizzaStore;
import factory.Factory.concretepizza.NY.NYStyleCeesePizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class NYStylePizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCeesePizza();
        }else {
            return null;
        }
    }

}
