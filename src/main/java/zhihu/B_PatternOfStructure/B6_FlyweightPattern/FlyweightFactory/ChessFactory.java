package zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightFactory;

import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.Chess;
import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.impl.BlackChess;
import zhihu.B_PatternOfStructure.B6_FlyweightPattern.FlyweightObj.impl.WhiteChess;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 第三步，共享对象工厂
 * 其负责提供共享对象，客户端不应该直接实例化棋子对象，而应该使用此工厂来获取。因为我们分了黑白两类对象，所以这里使用Color为key的map来存储共享对象。
 */
public class ChessFactory {

    private static final Map<Color, Chess> CHESS_MAP = new HashMap<>();

    public static Chess getChess(Color color) {
        Chess chess = CHESS_MAP.get(color);
        if (null == chess) {
            chess = color == Color.WHITE ? new WhiteChess() : new BlackChess();
            CHESS_MAP.put(color, chess);
        }
        return chess;
    }

}
