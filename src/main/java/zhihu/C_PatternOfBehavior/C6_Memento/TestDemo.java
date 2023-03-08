package zhihu.C_PatternOfBehavior.C6_Memento;

import zhihu.C_PatternOfBehavior.C6_Memento.CareTaker.GameCareTaker;
import zhihu.C_PatternOfBehavior.C6_Memento.Originator.GameOriginator;

/**
 * 备忘录模式
 *
 * 场景：
 *  保存游戏分数
 *
 */
public class TestDemo {

    public static void main(String[] args) {
        GameOriginator originator = new GameOriginator();
        GameCareTaker careTaker = new GameCareTaker();
        //玩游戏
        originator.playGame();
        //保存进度
        careTaker.saveMemento(originator.saveProcess());
        //退出游戏
        originator.exitGame();

        //重新打开游戏，恢复进度
        originator.restoreProcess(careTaker.getMemento(0));
        originator.playGame();
    }

}
