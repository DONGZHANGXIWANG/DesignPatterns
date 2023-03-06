package zhihu.B_PatternOfStructure.B6_FlyweightPattern;

import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightFactory.ChessFactory;
import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.Chess;

import java.awt.*;

/**
 * 享元模式
 *
 * 场景：
 * 最近王二狗的儿子爱上了玩五子棋，就让二狗给他做个五子棋的的手机游戏。你说这要求狗子能拒绝吗？说能的都是单身狗 o(￣︶￣)o。
 *
 * 二狗开始设计五子棋的架构，在分析到棋子那一块的时候，他想到了享元模式。他是这么分析的：这里需要大量的棋子对象，它们除了颜色有黑白之分，摆放的位置不同其他都一样，非常适合使用享元模式。
 *
 */
public class TestFlyweight {

    public static void main(String[] args) {
        //下黑子
        Chess backChess1 = ChessFactory.getChess(Color.BLACK);
        backChess1.draw(2, 5);

        //下白子
        Chess whiteChess = ChessFactory.getChess(Color.WHITE);
        whiteChess.draw(3, 5);

        //下黑子
        Chess backChess2 = ChessFactory.getChess(Color.BLACK);
        backChess2.draw(2, 6);

        /**
         * 从输出可见，backChess1 与 backChess2 是同一个对象，而whiteChess是另一个不同的对象。
         * 所以不论棋盘上有多少颗棋子，程序中只会保持最多两个棋子对象，这就极大的节约了内存。
         */
        System.out.println(String.format("backChess1:%d | backChess2:%d | whiteChess:%d",
                backChess1.hashCode(), backChess2.hashCode(), whiteChess.hashCode()));
    }

}
