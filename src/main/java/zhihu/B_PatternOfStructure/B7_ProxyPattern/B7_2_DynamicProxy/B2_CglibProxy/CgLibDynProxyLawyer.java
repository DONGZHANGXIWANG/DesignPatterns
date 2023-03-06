package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_2_DynamicProxy.B2_CglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 定义拦截器，在调用目标方法时，CGLib会回调MethodInterceptor接口方法拦截，来实现你自己的代理逻辑，类似于JDK中的InvocationHandler接口。
 */
public class CgLibDynProxyLawyer implements MethodInterceptor {


    public Object intercept(Object o, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("submit"))
            System.out.println("案件提交成功,证据如下："+ Arrays.asList(params));
        Object result = methodProxy.invokeSuper(o, params);
        return result;
    }
}
