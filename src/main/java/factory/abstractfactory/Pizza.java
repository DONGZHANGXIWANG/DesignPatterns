package factory.abstractfactory;

import factory.abstractfactory.Ingredient.*;

import java.util.ArrayList;

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
