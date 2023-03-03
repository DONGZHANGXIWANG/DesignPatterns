package zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction;

import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.ICoffeeAdditives;

import java.util.Random;

/**
 * 下面是一个对抽象化修正的一个类,蛋大在里面增加了一个用于品控的方法
 * 扩展抽象化角色，改变和修正父类对抽象化的定义。
 */
public abstract class RefinedCoffee extends Coffee {

    public RefinedCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    public void checkQuality () {
        Random ran = new Random();
        System.out.println(String.format("%s 添加 %s", coffeeAdditives.getClass().getSimpleName(), ran.nextBoolean() ? "太多" : "正常" ));
    }

}
