package factory.Factory;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 产品抽象类-披萨
 * Created by Administrator on 2018/2/26/026.
 */
public abstract class Pizza {

    public String name;    //名称
    public String dough;   //面团类型
    public String sauce;   //酱料类型
    public ArrayList toppings = new ArrayList();   //佐料

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

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

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}
