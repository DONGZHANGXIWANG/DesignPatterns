package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore.impl;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaStore.PizzaStore;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredient.ChicagoPizzaIngredientFactory;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.impl.CheesePizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza.impl.ClamPizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza= null;
        // 在生成对应类型的披萨时，  把对应的披萨原料传进具体的pizza里面
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
