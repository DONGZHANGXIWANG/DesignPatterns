package zhihu.A_PatternOfBuilder.A1_FactoryPattern.C_AbstractFactory;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){   //甚至可以声明成final类型，防止子类覆盖
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);     //工厂方法

}
