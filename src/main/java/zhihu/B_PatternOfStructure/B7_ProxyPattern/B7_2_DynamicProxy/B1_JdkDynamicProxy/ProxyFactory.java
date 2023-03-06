package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B1_JdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂：创建代理类实例
 */
public class ProxyFactory {

    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynProxyLawyer(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }

}
