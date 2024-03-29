package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Pizza;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.cheese.Cheese;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.clams.Clams;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.dough.Dough;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.pepperoni.Pepperoni;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.sauce.Sauce;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory.Ingredient.Basic.veggies.Veggies;

/**
 * 产品抽象类-披萨
 * Created by Administrator on 2018/2/26/026.
 */
public abstract class Pizza {

    public String name;    //名称
    public Dough dough;   //面团类型
    public Sauce sauce;   //酱料类型
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }
}
