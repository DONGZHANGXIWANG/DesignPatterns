package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore.impl;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore.PizzaStore;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredient.NYPizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.impl.CheesePizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.impl.ClamPizza;

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
