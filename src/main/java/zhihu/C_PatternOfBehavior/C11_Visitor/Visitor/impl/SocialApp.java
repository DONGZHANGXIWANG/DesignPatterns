package zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.impl;

import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Hr;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Programmer;
import zhihu.C_PatternOfBehavior.C11_Visitor.Element.impl.Tester;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.CorporateSlaveVisitor;

/**
 * Visitor实现类
 * <p>
 * 因为老板觉得社交是人类永恒的需求，所以开始想做社交App，他觉得他能成为微信第二。
 * <p>
 * 这就相当于要为每一个元素定义一套新的算法，让程序员仿照微信开发设计app，让测试完成即时通信的测试，让人力发软文。
 */
public class SocialApp implements CorporateSlaveVisitor {


    @Override
    public void visit(Programmer programmer) {
        System.out.println(String.format("%s: 给你一个月，先仿照微信搞个类似的APP出来,要能语音能发红包,将来公司上市了少不了你的，好好干...", programmer.getName()));
    }

    @Override
    public void visit(Tester tester) {
        System.out.println(String.format("%s: 这是咱创业的第一炮，一定要打响，测试不能掉链子啊，不能让APP带伤上战场，以后给你多招点人，你就是领导了...", tester.getName()));
    }

    @Override
    public void visit(Hr hr) {
        System.out.println(String.format("%s: 咱现在缺人，你暂时就充当了陪聊吧，在程序员开发APP期间，你去发发软文，积攒点粉丝...", hr.getName()));
    }
}
