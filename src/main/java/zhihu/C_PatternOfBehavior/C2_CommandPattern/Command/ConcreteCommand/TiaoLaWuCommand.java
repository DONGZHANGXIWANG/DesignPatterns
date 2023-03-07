package zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.ConcreteCommand;

import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.Command;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.BingBingReceiver;
import zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver.MiMiReceiver;


/**
 * 二狗还想看辣舞，所以再构建一个跳辣舞命令。由于只有MiMi号机器人提供这个能力，所以此处的执行者就变成了MiMiReceiver
 *
 *
 */
public class TiaoLaWuCommand implements Command {

    private MiMiReceiver daMiMi;
    /**
     * 我们看到，此命令里面除了具体执行命令的MiMiReceiver，还包含了命令执行时需要的数据，例如跳舞时长。
     * 这也是命令模式需要注意的地方，具体的命令类里不止包含具体执行命令的那个对象，也包含相关数据。
     */
    private String duration;//跳舞的时长

    public TiaoLaWuCommand(MiMiReceiver daMiMi, String duration) {
        this.daMiMi = daMiMi;
        this.duration = duration;
    }

    @Override
    public void execute() {
        System.out.println(String.format("开始跳舞表演，时长为：%s", duration));
        daMiMi.hotDance();
    }
}
