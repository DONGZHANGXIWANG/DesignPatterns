package zhihu.A_PatternOfBuilder.A2_SingletonPattern.C_DoubleCheck;

/**
 * 双层检查
 *  加锁解决懒汉式线程安全问题
 *  双层检查 解决 当多个线程调用 getInstance 时，每次都需要执行 synchronized 同步化方法，造成的程序的执行效率低下问题。
 *  这样增加一种检查方式后，如果 instance 已经被实例化，则不会执行同步化操作，大大提升了程序效率。
 * Created by Administrator on 2018/2/28/028.
 */
public class DubbleSingleton {

    private volatile static DubbleSingleton dubbleSingleton;

    private DubbleSingleton() {
    }

    public static DubbleSingleton getInstance(){
        if (dubbleSingleton == null){
            synchronized (DubbleSingleton.class){
                if(dubbleSingleton == null){
                    dubbleSingleton = new DubbleSingleton();
                }
            }
        }
        return dubbleSingleton;
    }

}
