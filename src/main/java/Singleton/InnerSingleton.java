package Singleton;

/**
 * 静态内部类
 * Created by Administrator on 2018/2/28/028.
 */
public class InnerSingleton {

    private static class ChocolateBoiler{
        private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
    }

    public static ChocolateBoiler getChocolateBoiler(){
        return ChocolateBoiler.chocolateBoiler;
    }

}
