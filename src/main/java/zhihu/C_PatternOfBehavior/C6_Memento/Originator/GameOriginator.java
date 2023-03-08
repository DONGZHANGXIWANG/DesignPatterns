package zhihu.C_PatternOfBehavior.C6_Memento.Originator;

import zhihu.C_PatternOfBehavior.C6_Memento.Memento.GameProgressMemento;

/**
 * 第二步：定义Originator
 * 这个类是游戏类，我们就是要保存和恢复游戏进度。
 * 它内部提供了两个方法，一个对外提供备忘录，里面封装了其要恢复的内部状态。另一个是从外部接收备忘录，用来恢复内部状态。
 * 可能有的同学要问了：为什么要这么搞呢？直接写个setter不香吗？其实核心思想还是为了封装。这里的currentScore是GameOriginator 的内部状态，我们不愿意对外暴露，所以使用另一个对象包起来。
 */
public class GameOriginator {

    private int currentScore;

    // 将需要保存的状态封装在 Memento 里面
    public GameProgressMemento saveProcess() {
        return new GameProgressMemento(currentScore);
    }

    // 通过从外部接收的Memento恢复状态
    public void restoreProcess(GameProgressMemento memento) {
        this.currentScore = memento.getScore();
    }

    public void playGame() {
        System.out.println("------------------开始游戏------------------");
        System.out.println("当前分数为：" + currentScore);
        System.out.println("杀死一个小怪物得1分");
        currentScore++;
        System.out.println(String.format("总分为：%d", currentScore));
    }

    public void exitGame() {
        System.out.println("退出游戏");
        currentScore = 0;
        System.out.println("-----------------退出游戏-------------------");
    }
}
