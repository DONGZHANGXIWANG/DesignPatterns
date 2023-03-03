package zhihu.B_PatternOfStructure.B4_DecoratorPattern.Decorator;

import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.ICoffee;

/**
 *第三步：构建装饰者抽象基类，它要实现与原始对象相同的接口ICoffee，其内部持有一个ICoffee类型的引用，用来接收被装饰的对象
 */
public abstract class CoffeeDecorator implements ICoffee {

    private ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    /**
     * 注意此方法
     */
    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
