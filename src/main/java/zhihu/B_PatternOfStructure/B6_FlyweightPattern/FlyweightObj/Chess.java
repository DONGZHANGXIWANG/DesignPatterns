package zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj;

/**
 * 第一步，定义一个共享对象通用的接口
 * 我们的棋子对象有一个绘制自己的通用操作
 */
public interface Chess {

    void draw(int x, int y);

}
