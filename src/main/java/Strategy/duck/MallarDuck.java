package Strategy.duck;

import Strategy.Duck;
import Strategy.FlyBehavior;
import Strategy.QuackBehavior;
import Strategy.flyimpl.FlyWithWings;
import Strategy.quackimpl.Quack;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
