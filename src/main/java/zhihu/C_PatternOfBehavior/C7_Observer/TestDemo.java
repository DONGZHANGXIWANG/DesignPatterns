package zhihu.C_PatternOfBehavior.C7_Observer;

import zhihu.C_PatternOfBehavior.C7_Observer.Oberser.impl.WangObserver;
import zhihu.C_PatternOfBehavior.C7_Observer.Oberser.impl.XiMenObserver;
import zhihu.C_PatternOfBehavior.C7_Observer.Subject.GreenTeaBitchSubject;
import zhihu.C_PatternOfBehavior.C7_Observer.Subject.impl.ShangguanSubject;

/**
 * 观察者模式
 * <p>
 * demo场景
 * 王二狗前两天到北京出差见了一个大学同学，两人撸烤串、喝啤酒、忆往昔、吹牛逼...酒过三巡，同学突然说：你知道吗？当年你拼命追求的女神上官无雪离婚了，听说他老公出轨了自己的女下属... 两人提前转移了财产，现在上官那叫一个惨...，你说她当年要是选了你现在多幸福... 二狗陷入了那些当舔狗的峥嵘岁月... 当年二狗和西门淫荡都喜欢上了上官无雪，那时校内网风头正盛，二狗和西门都订阅了上官的的校内网消息，女神的一条想法，就是二狗和西门行动的命令...
 * <p>
 * 这个案例对应到程序上就是二狗和西门都在观察上官的状态，上官的每一条状态改变都通过校内网通知了二狗和西门，于是他们根据这个事件做出行动。
 */
public class TestDemo {

    public static void main(String[] args) {
        GreenTeaBitchSubject subject = new ShangguanSubject();
        WangObserver dog2WangObserver = new WangObserver();
        subject.add(dog2WangObserver);
        subject.add(new XiMenObserver());

        System.out.println("------午夜12点，肚子好饿，找个人来买东西吃------");
        subject.notifyState("肚子好饿");
        System.out.println("------又被渣男甩了，有点小难过，找个人来安慰一下------");
        subject.notifyState("心情不好");
        System.out.println("------二狗终于看透了上官这个绿茶婊，和牛翠花走到了一起------");
        subject.remove(dog2WangObserver);
        System.out.println("------上官又被渣男甩了，想找个人来安慰一下，却不见了那个好人的身影------");
        subject.notifyState("心情不好");
    }

}
