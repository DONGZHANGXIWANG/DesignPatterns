package zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.concretepizza.Chicago;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.Pizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class ChicagoStyleCeesePizza extends Pizza{

    public ChicagoStyleCeesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza!";
        dough = "Extra Thick Crust Dough!";
        sauce = "Plum Tomato Sauce!";
        toppings.add("Shredded Mozzarella Cheese!");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
