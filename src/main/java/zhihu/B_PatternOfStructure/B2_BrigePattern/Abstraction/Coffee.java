package zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction;

import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.ICoffeeAdditives;

/**
 * 第二步：创建抽象化部分的接口定义 —— 咖啡容量的维度
 *
 * 我们可以看到，Coffee持有了ICoffeeAdditives 引用，ICoffeeAdditives 的实例是通过构造函数注入的，这个过程就是我们所说的《桥接》过程。
 * 我们通过这个引用就可以调用ICoffeeAdditives的方法，进而将Coffee的行为与ICoffeeAdditives的行为通过orderCoffee()方法而组合起来。
 */
public abstract class Coffee {

    protected ICoffeeAdditives coffeeAdditives;

    public Coffee(ICoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    public abstract void orderCoffee(int count);
}
