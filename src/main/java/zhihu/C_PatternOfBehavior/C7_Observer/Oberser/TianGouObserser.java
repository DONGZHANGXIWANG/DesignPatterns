package zhihu.C_PatternOfBehavior.C7_Observer.Oberser;

/**
 * 观察者
 * 先定义一个观察者接口，里面只有一个方法，观察者就是在这个方法里面接收被观察者发送的状态改变通知。
 */
public interface TianGouObserser {
    
    void update(String msg);
    
}
