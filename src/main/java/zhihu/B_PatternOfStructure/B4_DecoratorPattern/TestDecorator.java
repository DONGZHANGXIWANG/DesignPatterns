package zhihu.B_PatternOfStructure.B4_DecoratorPattern;

import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Decorator.impl.MilkDecorator;
import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Decorator.impl.SugarDecorator;
import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.ICoffee;
import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.impl.OriginalCoffee;

/**
 * 装饰者模式
 */
public class TestDecorator {

    public static void main(String[] args) {
        //原味咖啡
        ICoffee coffee=new OriginalCoffee();
        coffee.makeCoffee();
        System.out.println("");

        //加奶的咖啡
        coffee=new MilkDecorator(coffee);
        coffee.makeCoffee();
        System.out.println("");

        //先加奶后加糖的咖啡
        coffee=new SugarDecorator(coffee);
        coffee.makeCoffee();
    }

}
