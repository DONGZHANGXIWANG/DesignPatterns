package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxy;

import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.LawSuit;

public class ProxyLawyer implements LawSuit {

    // 要持有被代理对象
    private LawSuit lawSuit;

    public ProxyLawyer(LawSuit lawSuit) {
        this.lawSuit = lawSuit;
    }

    @Override
    public void submit(String proof) {
        System.out.println("触发大律师提交关键证据");
        lawSuit.submit(proof);
    }

    @Override
    public void defend() {
        System.out.println("触发大律师唇枪舌战");
        lawSuit.defend();
    }
}
