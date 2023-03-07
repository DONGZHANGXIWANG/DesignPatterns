package zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand;

import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.Command;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.BingBingReceiver;

/**
 * 第三步：构建各种具体命令（ConcreteCommand）
 *
 * 构建一个唱歌命令，其要实现Command接口。因为只有BingBing机器人提供这个功能，所以我们要在这个命令内部使用BingBingReceiver 来具体执行。
 *
 */
public class SingSongCommand implements Command {

    private BingBingReceiver bingBing;

    public SingSongCommand(BingBingReceiver bingBing) {
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.singSong();
    }
}
