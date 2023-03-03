package zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.impl;

import zhihu.B_PatternOfStructure.B4_DecoratorPattern.Origin.ICoffee;

/**
 * 第二步：构建我们的原始对象，此处为原味咖啡对象，它实现了ICoffee接口。
 */
public class OriginalCoffee implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.println("原味咖啡");
    }
}
