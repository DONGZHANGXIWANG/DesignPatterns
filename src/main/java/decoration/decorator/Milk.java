package decoration.decorator;

import decoration.Beverage;
import decoration.CondimentDecorator;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.5 + beverage.cost();
    }
}
