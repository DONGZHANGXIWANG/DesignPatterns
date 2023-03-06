package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.ProxyFactory;

import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxy.ProxyLawyer;
import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.LawSuit;
import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.impl.ErDongWang;

public class LawyerProxyFactory {

     public static LawSuit getLawProxy(){
         return new ProxyLawyer(new ErDongWang());
     }

}
