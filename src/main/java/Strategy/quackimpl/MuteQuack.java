package Strategy.quackimpl;

import Strategy.QuackBehavior;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("QuackBehavior.MuteQuack!");
    }
}
