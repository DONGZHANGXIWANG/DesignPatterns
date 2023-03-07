package zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand;

import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.Command;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.BingBingReceiver;

/**
 * 第三步：构建各种具体命令（ConcreteCommand）
 * <p>
 * 构建一个弹琴命令，与前面唱歌命令类似
 */
public class PlayPianoCommand implements Command {

    private BingBingReceiver bingBing;

    public PlayPianoCommand(BingBingReceiver bingBing) {
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.playPiano();
    }
}
