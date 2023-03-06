package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy;

import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.ProxyFactory.LawyerProxyFactory;

/**
 * 静态代理
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        LawyerProxyFactory.getLawProxy().submit("考勤打卡证据");
        LawyerProxyFactory.getLawProxy().defend();
    }

}
