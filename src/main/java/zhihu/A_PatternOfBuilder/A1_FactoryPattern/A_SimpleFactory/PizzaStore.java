package zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory;


import zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory.dto.Pizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orederPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.make();
        return pizza;
    }


}
