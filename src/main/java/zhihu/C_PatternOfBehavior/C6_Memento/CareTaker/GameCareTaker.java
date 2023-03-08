package zhihu.C_PatternOfBehavior.C6_Memento.CareTaker;

import zhihu.C_PatternOfBehavior.C6_Memento.Memento.GameProgressMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * 第三步:如果说备忘录模式有一点点技巧的话，也就是这个类了。
 *
 * CareTaker相对于Originator来说是一个外部组件，它帮助Originator保存了状态，相当于Originator将自己某一个时刻的状态保存到了外部。
 *
 * 当我们要保存状态时，使用此类的saveMemento。当我们要恢复状态时，使用此类的getMemento
 */
public class GameCareTaker {

    private List<GameProgressMemento> mementos = new ArrayList<>();

    public void saveMemento(GameProgressMemento memento) {
        this.mementos.add(memento);
    }

    public GameProgressMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}
