package zhihu.B_PatternOfStructure.B1_AdapterPattern.Adapter;

import zhihu.B_PatternOfStructure.B1_AdapterPattern.NewInterface.NbLogger;
import zhihu.B_PatternOfStructure.B1_AdapterPattern.OldInterface.LogFactory;

import java.util.Objects;

/**
 * 第三，构建适配器类
 * 这个类是适配器模式的核心，通过此类就可以将三方库提供的接口转换为系统的目标接口
 * LogAdapter 实现了系统的目标接口，同时持有三方库NbLogger的引用。
 */
public class LogAdapter implements LogFactory {

    private NbLogger nbLogger;

    public LogAdapter(NbLogger nbLogger) {
        this.nbLogger = nbLogger;
    }

    @Override
    public void debug(String tag, String message) {
        Objects.requireNonNull(nbLogger);
        nbLogger.d(1, message);
    }
}
