package zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.concretepizzastore;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.Pizza;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.PizzaStore;
import zhihu.A_PatternOfBuilder.A1_FactoryPattern.B_FactoryMethod.concretepizza.NY.NYStyleCeesePizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class NYStylePizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCeesePizza();
        }else {
            return null;
        }
    }

}
