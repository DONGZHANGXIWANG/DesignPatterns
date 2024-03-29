package zhihu.A_PatternOfBuilder.A2_SingletonPattern.B_LazyPattern;

/**
 * 懒汉式-有多线程问题
 * Created by Administrator on 2018/2/28/028.
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
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
