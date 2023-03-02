package zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.impl;

import zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.RefinedCoffee;
import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.ICoffeeAdditives;

public class LargeCoffee extends RefinedCoffee {
    public LargeCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        coffeeAdditives.addSomething();
        System.out.println(String.format("大杯咖啡%d杯", count));
    }
}
