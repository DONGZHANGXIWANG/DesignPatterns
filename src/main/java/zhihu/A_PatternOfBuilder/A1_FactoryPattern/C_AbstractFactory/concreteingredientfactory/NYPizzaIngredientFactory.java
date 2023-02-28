package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.concreteingredientfactory;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.*;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.PizzaIngredientFactory;

/**
 * Created by Administrator on 2018/2/27/027.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThingCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies Veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return Veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
