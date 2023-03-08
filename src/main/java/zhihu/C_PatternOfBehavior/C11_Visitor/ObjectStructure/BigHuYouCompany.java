package zhihu.C_PatternOfBehavior.C11_Visitor.ObjectStructure;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.CorporateSlave;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Hr;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Programmer;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Tester;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 第二步：构建ObjectStructure
 * <p>
 * BigHuYouCompany 类里面需要包含相对稳定的元素（大忽悠老板就招这3个人，再也不肯招人），而且要求可以对这些元素迭代访问。此处我们以集合存储3位员工。
 */
public class BigHuYouCompany {

    private List<CorporateSlave> employee = new ArrayList<>();

    public BigHuYouCompany() {
        employee.add(new Programmer("王二狗"));
        employee.add(new Hr("上官无需"));
        employee.add(new Tester("牛翠花"));
    }

    /**
     * 先看在BigHuYouCompany 类里的分派代码： slave.accept(visitor); 中accept方法的分派是由slave的运行时类型决定的。
     * 若slave是Programer就执行Programer的accept方法。若slave是Tester那么就执行Tester的accept方法。
     * 通过此步骤就完成了一次动态单分派。
     * @param visitor
     */
    public void startProject(CorporateSlaveVisitor visitor) {
        for (CorporateSlave slave : employee) {
            slave.accept(visitor);
        }
    }

}
