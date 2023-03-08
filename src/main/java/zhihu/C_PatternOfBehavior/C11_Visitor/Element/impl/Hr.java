package zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.CorporateSlave;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

/**
 * 构建具体的元素
 * 社畜：人事
 */
public class Hr implements CorporateSlave {
    private String name;

    public Hr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 再看一下具体的Element里的分派代码：visitor.visit(this); 中visit方法的分派是由参数 this的运行时类型决定的。
     * 若this是Programer就执行Visitor中的visit(Programer)方法。若slave是Tester那么就执行Visitor的visit(Tester)方法。
     * 通过这一步又完成了一次动态单分派。
     * 两次动态单分派结合起来就完成了一次伪动态双分派，为什么叫伪动态装派呢？因为在Java中动态分派是单分派的，而此处是通过两次动态单分派达到了双分派的效果，所以说是伪的！
     * @param visitor
     */
    // 注意在element类里面将自己传递给visitor的visit()方法
    @Override
    public void accept(CorporateSlaveVisitor visitor) {
        visitor.visit(this);
    }
}
