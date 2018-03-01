package factory.abstractfactory.concretepizzastore;

import factory.abstractfactory.Pizza;
import factory.abstractfactory.PizzaStore;
import factory.abstractfactory.concreteingredientfactory.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.concretepizza.CheesePizza;
import factory.abstractfactory.concretepizza.ClamPizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza= null;
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if (type.equals("clam")){
            pizza = new ClamPizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
