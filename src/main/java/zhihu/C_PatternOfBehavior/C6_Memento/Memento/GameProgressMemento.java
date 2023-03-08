package zhihu.C_PatternOfBehavior.C6_Memento.Memento;

/**
 * 第一步：构建备忘录Memento
 * 这个类最简单，其基本上就是一个POJO。
 * 它不包含业务逻辑，只包含状态数据，结构由要保存的状态类决定。
 * 例如我们这里只保存一个内部状态，游戏分数。
 */
public class GameProgressMemento {

    private int score;

    public GameProgressMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
