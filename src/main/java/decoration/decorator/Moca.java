package decoration.decorator;

import decoration.Beverage;
import decoration.CondimentDecorator;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class Moca extends CondimentDecorator {

    public Moca(Beverage beverage) {

        this.beverage = beverage;

    }

    public double cost() {
        return 1+beverage.cost();
    }
}