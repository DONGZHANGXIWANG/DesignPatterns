package Strategy.quackimpl;

import Strategy.QuackBehavior;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("QuackBehavior.Quack!");
    }
}
