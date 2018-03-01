package factory.Factory.concretepizza.NY;

import factory.Factory.Pizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class NYStyleCeesePizza extends Pizza{

    public NYStyleCeesePizza() {
        name = "NY Style Sauce and Cheese Pizza!";
        dough = "Thin Crust Dough!";
        sauce = "Marinara Sauce!";
        toppings.add("Grated Reggiano Cheese!");
    }
}
