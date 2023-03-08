package zhihu.C_PatternOfBehavior.C11_Visitor.Element;

import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

/**
 * 第一步：构建Element
 * 毕竟改变的是元素的算法，所以这里我们先构建元素。
 * 社畜类只有一个accept方法，它需要一个访问者接口类型的参数
 */
public interface CorporateSlave {

    void accept(CorporateSlaveVisitor corporateSlaveVisitor);

}
