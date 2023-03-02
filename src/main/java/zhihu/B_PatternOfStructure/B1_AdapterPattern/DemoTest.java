package zhihu.B_PatternOfStructure.B1_AdapterPattern;

import zhihu.B_PatternOfStructure.B1_AdapterPattern.Adapter.LogAdapter;
import zhihu.B_PatternOfStructure.B1_AdapterPattern.NewInterface.impl.NbLoggerImpl;
import zhihu.B_PatternOfStructure.B1_AdapterPattern.OldInterface.LogFactory;

/**
 * 最近王二狗工作上遇到了一件非常不开心的事：由于老项目中的日志系统非常粗糙，导致他debug时候非常吃力，为此都加了好几次班了，媳妇都不高兴了。某天，二狗又一次披星戴月的回到家中，蹑手蹑脚脱了衣服慢慢爬上床时，此时只听的床头那边幽幽的传来一声抱怨：二狗，你天天忙着调试bug，你就不担心你媳妇被隔壁老王调试了？
 *
 * 二狗深感不安，决定彻底扭转这个不利的局面。于是他调研了一个非常棒的三方开源日志库来改进项目的log系统，但是此开源库与项目中接口不兼容，这几乎是肯定的，所以王二狗又一次展现出了其高超的程序设计能力，精准的采用了适配器模式来完成这个功能。
 */
public class DemoTest {

    public static void main(String[] args) {
        LogFactory logFactory = new LogAdapter(new NbLoggerImpl());
        logFactory.debug("测试当前打印的日志", "风花雪月");
    }

}
