package zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory.dto.impl;

import zhihu.A_PatternOfBuilder.A1_FactoryPattern.A_SimpleFactory.dto.Pizza;

/**
 * Created by Administrator on 2018/2/26/026.
 */
public class CheesePizza implements Pizza {
    public void make() {
        System.out.println("cheese pizza!");
    }
}
