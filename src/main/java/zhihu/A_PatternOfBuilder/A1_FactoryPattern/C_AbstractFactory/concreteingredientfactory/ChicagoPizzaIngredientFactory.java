package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concreteingredientfactory;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.*;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaIngredientFactory;

/**
 * Created by Administrator on 2018/2/27/027.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new Mozzarella();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOvlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
