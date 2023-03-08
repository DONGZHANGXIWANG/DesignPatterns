package zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.impl;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Hr;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Programmer;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Tester;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

/**
 * 过了一段时间，老板又觉的短视频很火，又要做短视频，这就要求给每一员工增加一套新的算法。
 */
public class LiveApp implements CorporateSlaveVisitor {


    @Override
    public void visit(Programmer programmer) {
        System.out.println(String.format("%s: 最近小视频很火啊，咱能不能抄袭下抖音，搞他一炮,将来公司上市了，你的身价至少也是几千万，甚至上亿...", programmer.getName()));
    }

    @Override
    public void visit(Tester tester) {
        System.out.println(String.format("%s: 你也开个账户，边测试边直播，两不耽误...", tester.getName()));
    }

    @Override
    public void visit(Hr hr) {
        System.out.println(String.format("%s: 咱公司就数你长得靓，哪天化化妆，把你的事业线适当露一露，要是火了你在北京买房都不是梦...", hr.getName()));
    }
}
