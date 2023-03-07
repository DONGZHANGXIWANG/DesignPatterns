package zhihu.C_PatternOfBehavior.C2_CommandPattern.Receiver;

/**
 * 第二步：构建那些可以具体完成命令的角色（Receiver）
 *  构建一个BingBing号机器人
 */
public class BingBingReceiver {

    public void singSong(){
        System.out.println("雨下整夜, 我的爱溢出就像雨水!");
    }

    public void playPiano(){
        System.out.println("plaing 卡农 C 大调");
    }

}
