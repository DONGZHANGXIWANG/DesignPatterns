package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.*;

/**
 * 原料工厂的接口，负责创建所有的原料
 * Created by Administrator on 2018/2/27/027.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
