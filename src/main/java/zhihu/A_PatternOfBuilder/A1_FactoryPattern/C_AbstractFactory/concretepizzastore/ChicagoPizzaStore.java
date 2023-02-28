package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizzastore;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concreteingredientfactory.ChicagoPizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizza.CheesePizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concretepizza.ClamPizza;

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
