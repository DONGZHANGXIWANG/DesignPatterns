package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B2_CglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * 定义动态代理工厂，生成动态代理
 */
public class ProxyFactory {

    public static Object getGcLibDynProxy(Object target){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CgLibDynProxyLawyer());
        Object targetProxy= enhancer.create();
        return targetProxy;
    }

}
