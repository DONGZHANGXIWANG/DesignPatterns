package Strategy;

import Strategy.duck.MallarDuck;
import Strategy.flyimpl.FlyNoWay;

/**
 * 策略模式：定义了算法簇，分别封装起来，让他们之间可以互相替换，此模式让算法的变法独立于使用算法的用户
 * 设计原则：
 *      封装变化：在这里变化的是鸭子叫和飞的行为方式
 *      针对接口编程，而不是针对实现编程：变量声明的类型为父类，而不是具体的某个子类。父类中的方法实现不在父类，而是在各个子类。程序在运行时可以动态改变变量所指向的子类类型
 *      多用组合，少用继承：组合也就是has-a关系，通过组合，可以在运行时动态改变实现，只要通过改变父类对象具体指向哪个子类即可。而继承就不能做到，继承体系在创建类时就已确定
 * Created by Administrator on 2018/2/25/025.
 */
public class Demo {

    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        mallarDuck.setFlyBehavior(new FlyNoWay());
        mallarDuck.performFly();
    }

}
