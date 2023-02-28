package zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class Demo {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        pizza.make();
    }

}
