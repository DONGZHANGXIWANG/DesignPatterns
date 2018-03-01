package Singleton;

/**
 * 双层检查
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
