package zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.impl;

import zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.RefinedCoffee;
import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.ICoffeeAdditives;

public class SmallCoffee extends RefinedCoffee {
    public SmallCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        coffeeAdditives.addSomething();
        System.out.println(String.format("小杯咖啡%d杯", count));
    }
}
