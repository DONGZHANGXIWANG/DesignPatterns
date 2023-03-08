package zhihu.C_PatternOfBehavior.C11_Visitor.Visitor;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Hr;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Programmer;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Tester;

/**
 * 第三步：构建Visitor
 * Visitor 接口里面一般会存在与各元素对应的visit方法，例如此例我们有3个角色，所以这里就有3个方法。
 */
public interface CorporateSlaveVisitor {
    void visit(Programmer programmer);

    void visit(Tester tester);

    void visit(Hr hr);
}
