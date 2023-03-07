package zhihu.C_PatternOfBehavior.C2_CommandPattern.Invoke;

import zhihu.C_PatternOfBehavior.C2_CommandPattern.Command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 第四步：构建命令的调用者 （Invoker）
 * 机器人和命令都准备好了，那么具体怎么发送呢？这就是Invoker的角色了。二狗买这两个机器人时还带了一个智能语音控制器，他通过这个控制器就可以发出各种命令了。
 */
public class RobotInvoker {

    private final List<Command> sexRobotCommands = new ArrayList<>();

    public void clearCommand(){
        sexRobotCommands.clear();
    }

    //设置一套命令，不知道具体执行者是谁
    public void addCommands(Command command) {
        sexRobotCommands.add(command);
    }

    //执行系列命令
    public void executeCommand() {
        for (Command command : sexRobotCommands) {
            command.execute();
        }
    }

}
