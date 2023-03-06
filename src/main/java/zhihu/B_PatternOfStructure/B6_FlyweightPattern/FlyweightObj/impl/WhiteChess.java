package zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.impl;

import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.Chess;

import java.awt.*;


/**
 * 第二步，实现需要共享的对象类
 * 我们的棋子对象分为黑白两类，所以此处我们将颜色设计为对象的内部状态来共享，而不是外部状态，所以就需要黑白两个对象类。如果你把颜色作为外部状态，那么只需要一个对象类即可。
 */
public class WhiteChess implements Chess {

    // 内部状态
    private final Color color = Color.WHITE;

    private final String sharp = "圆形";

    public Color getColor() {
        return color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp, "白棋", x, y));
    }


}
