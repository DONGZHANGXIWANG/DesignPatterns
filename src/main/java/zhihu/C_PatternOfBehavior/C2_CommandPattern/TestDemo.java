package zhihu.C_PatternOfBehavior.C2_CommandPattern;

import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand.PlayPianoCommand;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand.SingSongCommand;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand.TiaoLaWuCommand;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Invoke.RobotInvoker;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.BingBingReceiver;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.MiMiReceiver;

/**
 * 命令模式
 *
 * Demo场景
 * 21世纪，人类社会的科技日新月异，狂人马斯克正在努力在2050年前将100万人类送往火星殖民。同时人类社会在其他方面也在努力创新，比如人工智能，这不最近有一家科技公司尽然制造出了高智慧机器人，还支持订制，真是太贴心了。王二狗很兴奋，乘着媳妇出差的时候，偷偷订制了两款：BingBing号与MiMi号。
 * 今夜，王二狗就是整个小区那个最靓的仔，一切准备就绪，准备发车... 二狗随后会向机器人发出各种各样的指令，这个就很适合使用命令模式
 */
public class TestDemo {

    public static void main(String[] args) {
        //robot 控制系统，用户通过此系统来发出命令
        RobotInvoker invoker = new RobotInvoker();

        // 生成唱歌弹琴命令
        BingBingReceiver bingBingReceiver = new BingBingReceiver();
        SingSongCommand singSongCommand = new SingSongCommand(bingBingReceiver);
        PlayPianoCommand playPianoCommand = new PlayPianoCommand(bingBingReceiver);

        // 构建执行计划
        invoker.addCommands(singSongCommand);
        invoker.addCommands(playPianoCommand);

        // 执行命令
        invoker.executeCommand();

        // 生成跳舞命令
        TiaoLaWuCommand tiaoLaWuCommand = new TiaoLaWuCommand(new MiMiReceiver(), "300");
        invoker.addCommands(tiaoLaWuCommand);
        invoker.executeCommand();

    }
}
