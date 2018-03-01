package factory.SimpleFactory;


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
