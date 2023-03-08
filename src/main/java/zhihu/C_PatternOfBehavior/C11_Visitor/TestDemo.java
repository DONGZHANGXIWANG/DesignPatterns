package zhihu.C_PatternOfBehavior.C11_Visitor;

import zhihu.C_PatternOfBehavior.C11_Visitor.ObjectStructure.BigHuYouCompany;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.impl.LiveApp;
import zhihu.C_PatternOfBehavior.C11_Visitor.Visitor.impl.SocialApp;

/**
 * 访问者模式
 * <p>
 * Demo场景
 * 王二狗刚参加工作那会由于社会经验不足误入了一个大忽悠公司，公司老板不舍得花钱就给公司招了3个人，一个Hr，一个程序员，一个测试，但关键是老板总想追风口，啥都想做，一会社交，一会短视频。二狗多次提出说人太少，申请加几个人，至少加个保洁阿姨啊，每天都自己打扫卫生，累屁了。每到此时老板就画大饼：你现在刚毕业正是要奋斗的时候，此时不奋斗什么时候奋斗？过两年公司上市了，你作为元老就财富自由拉...balabala
 * <p>
 * 这个场景就很适合使用访问者模式：
 * <p>
 * 大忽悠公司结构很稳定，老板舍不得花钱招人，总共就那么3个人，还是3种角色，即只有3个元素。
 * 大忽悠公司老板想法多，这就要求这3个人承担各种新技能，即不断的给元素增加新的算法。
 */
public class TestDemo {
    public static void main(String[] args) {
        BigHuYouCompany bigHuYou = new BigHuYouCompany();
        //可以很轻松的更换Visitor，但是要求BigHuYouCompany的结构稳定
        System.out.println("-----------------启动社交APP项目--------------------");
        bigHuYou.startProject(new SocialApp());
        System.out.println("-----------------启动短视频APP项目--------------------");
        bigHuYou.startProject(new LiveApp());
    }


}
