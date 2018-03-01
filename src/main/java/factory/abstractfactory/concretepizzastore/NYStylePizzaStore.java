package factory.abstractfactory.concretepizzastore;

import factory.abstractfactory.Pizza;
import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.PizzaStore;
import factory.abstractfactory.concreteingredientfactory.NYPizzaIngredientFactory;
import factory.abstractfactory.concretepizza.CheesePizza;
import factory.abstractfactory.concretepizza.ClamPizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }

}
