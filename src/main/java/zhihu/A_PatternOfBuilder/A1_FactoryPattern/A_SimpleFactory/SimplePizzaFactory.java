package zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory;


/**
 * Created by Administrator on 2018/2/26/026.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            return new CheesePizza();
        }else if(type.equals("greek")){
            return new GreekPizza();
        }else {
            return null;
        }
    }

}

