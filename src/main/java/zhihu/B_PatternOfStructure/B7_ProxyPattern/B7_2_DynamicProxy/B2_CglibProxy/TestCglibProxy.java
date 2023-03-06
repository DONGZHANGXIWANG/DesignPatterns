package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B2_CglibProxy;

public class TestCglibProxy {

    public static void main(String[] args) {
        Frank cProxy= (Frank) ProxyFactory.getGcLibDynProxy(new Frank());
        cProxy.submit("工资流水在此");
        cProxy.defend();
    }

}
