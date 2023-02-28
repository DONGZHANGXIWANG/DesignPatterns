package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizzastore;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concreteingredientfactory.NYPizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizza.CheesePizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizza.ClamPizza;

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
