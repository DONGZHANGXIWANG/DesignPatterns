package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B1_JdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Jdk动态代理
 * 代理类实现 InvocationHandler  接口
 */
public class DynProxyLawyer implements InvocationHandler {

    // 被代理对象
    private Object object;

    public DynProxyLawyer(Object object) {
        this.object = object;
    }

    /**
     * 代理方法
     *
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展" + method.getName());
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
