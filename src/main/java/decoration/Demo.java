package decoration;

import decoration.concrete.HouseBlend;
import decoration.decorator.Milk;
import decoration.decorator.Moca;

/**
 * 装饰者模式-动态地将责任附加到对象上。在扩展功能上，装饰者提供了比继承更有弹性的替代方案。
 * 设计原则：
 *      类应该对修改关闭，对扩展开放：也就是添加新功能时不需要修改代码。
 * Created by Administrator on 2018/2/25/025.
 */
public class Demo {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Moca(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }

}
