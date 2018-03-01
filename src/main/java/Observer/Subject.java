package Observer;

/**
 * Created by Administrator on 2018/2/25/025.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
