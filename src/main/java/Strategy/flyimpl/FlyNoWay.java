package Strategy.flyimpl;

import Strategy.FlyBehavior;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("FlyBehavior.FlyNoWay!");
    }
}
