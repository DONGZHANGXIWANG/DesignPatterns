package zhihu.A_PatternOfBuilder.A2_SingletonPattern.D_InnerClass;

/**
 * 静态内部类
 * 其和双层检查一样，保证懒汉式单例的线程安全
 * 问题：
 *      1、静态内部类方式是怎么实现懒加载的
 *          Java 类的加载过程包括：加载、验证、准备、解析、初始化。初始化阶段即执行类的 clinit 方法（clinit = class + initialize），包括为类的静态变量赋初始值和执行静态代码块中的内容。但不会立即加载内部类，内部类会在使用时才加载。所以当此 InnerSingleton 类加载时，InnerSingletonHolder 并不会被立即加载，所以不会像饿汉式那样占用内存。
 *          另外，Java 虚拟机规定，当访问一个类的【静态字段】时，如果该类尚未初始化，则立即初始化此类。当调用 InnerSingleton 的 getInstance 方法时，由于其使用了 InnerSingletonHolder 的静态变量 instance，所以这时才会去初始化 InnerSingletonHolder，在 InnerSingletonHolder 中 new 出 InnerSingleton 对象。这就实现了懒加载。
 *      2、静态内部类方式是怎么保证线程安全的
 *          Java 虚拟机的设计是非常稳定的，早已经考虑到了多线程并发执行的情况。虚拟机在加载类的 clinit 方法时，会保证 clinit 在多线程中被正确的加锁、同步。即使有多个线程同时去初始化一个类，一次也只有一个线程可以执行 clinit 方法，其他线程都需要阻塞等待，从而保证了线程安全。
 * Created by Administrator on 2018/2/28/028.
 */
public class InnerSingleton {

    // 静态内部类
    private static class InnerSingletonHolder{
        // 静态成员
        private static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return InnerSingletonHolder.instance;
    }

}
