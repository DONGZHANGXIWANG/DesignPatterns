package zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.impl;

import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.ICoffeeAdditives;

/**
 * 实现 实现化部分 —— 咖啡口味维度
 */
public class Suger implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}
