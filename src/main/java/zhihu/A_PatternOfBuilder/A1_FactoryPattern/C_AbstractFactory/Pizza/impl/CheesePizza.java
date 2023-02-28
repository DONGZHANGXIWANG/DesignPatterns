package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.impl;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredientFactory;

/**
 * Created by Administrator on 2018/2/27/027.
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
