package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B1_JdkDynamicProxy;

import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.LawSuit;
import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.impl.CuiHuaNiu;

public class TestJdkProxy {

    public static void main(String[] args) {
        LawSuit proxy= (LawSuit) ProxyFactory.getDynProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
