package zhihu.B_PatternOfStructure.B4_DecoratorPattern.Decorator.impl;

import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Decorator.CoffeeDecorator;
import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.ICoffee;

/**
 * 第四步：构建各种装饰者类，他们都继承至装饰者基类 CoffeeDecorator。此处生成了两个，一个是加奶的装饰者,另一个是加糖的装饰者。
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    private void addSugar() {
        System.out.println("加糖!");
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSugar();
    }
}
