package zhihu.A_PatternOfBuilder.A2_SingletonPattern.A_EagerPattern;

/**
 * 饿汉式-也有BUG
 * 单例的构造方法必须私有化(private)，保证了其他类无法实例化此类，必须通过 getInstance 方法才能获取到唯一的 instance 实例
 * Created by Administrator on 2018/2/28/028.
 */
public class ChocolateBoiler2 {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler2 chocolateBoiler2 = new ChocolateBoiler2();

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler2 getChocolateBoiler(){
        return chocolateBoiler2;
    }


    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

}
