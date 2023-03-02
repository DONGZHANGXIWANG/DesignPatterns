package zhihu.B_PatternOfStructure.B1_AdapterPattern.NewInterface.impl;

import zhihu.B_PatternOfStructure.B1_AdapterPattern.NewInterface.NbLogger;

public class NbLoggerImpl implements NbLogger {
    @Override
    public void d(int priority, String message, Object... obj) {
        System.out.println(String.format("牛逼logger记录: %s", message));
    }
}
