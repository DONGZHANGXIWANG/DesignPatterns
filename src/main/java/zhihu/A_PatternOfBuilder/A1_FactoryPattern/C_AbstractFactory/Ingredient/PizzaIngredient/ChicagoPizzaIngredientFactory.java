package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredient;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.cheese.Cheese;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.cheese.Mozzarella;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.clams.Clams;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.clams.FrozenClams;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.dough.Dough;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.dough.ThickCrustDough;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.pepperoni.Pepperoni;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.pepperoni.SlicedPepperoni;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.sauce.PlumTomatoSauce;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.sauce.Sauce;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.veggies.Veggies;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.veggies.impl.BlackOvlives;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.veggies.impl.Eggplant;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.veggies.impl.Spinach;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.PizzaIngredientFactory;

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
