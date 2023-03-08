package zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.CorporateSlave;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

/**
 * 构建具体的元素
 * 社畜：测试
 */
public class Tester implements CorporateSlave {
    private String name;

    public Tester(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //注意在element类里面将自己传递给visitor的visit()方法
    @Override
    public void accept(CorporateSlaveVisitor visitor) {
        visitor.visit(this);
    }
}
