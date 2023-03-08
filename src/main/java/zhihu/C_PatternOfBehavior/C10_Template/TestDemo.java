package zhihu.C_PatternOfBehavior.C10_Template;

/**
 * 模板方法
 * <p>
 * Demo场景
 * 直播行业是2017年互联网行业的风口，有熊猫直播、映客直播、陌陌直播、虎牙直播。。。说是全民直播也不为过。王二狗他们老板也想当风口的猪，就是说它想借着风上天，于是也加入了直播行业大军。小公司不可能自己开发一套直播的基础架构系统，实力不允许，于是就想到了接入第三方的直播SDK，刚开始接入了腾讯的直播SDK，后来由于不稳定又要同时接入金山的SDK，而且要做到可以互相切换。
 * 当王二狗带着小弟林蛋大日夜赶工，一个月后把这个功能实现后发现：我你妈这重复代码太多了，的重构啊，不然老板哪天又要接其他家的SDK可咋办，总不能把几乎一毛一样的代码再写一遍吧。
 * 因为用户看直播是有一套固定的模板流程的：登录---进入房间---获取音视频流---观看---停止音视频流---退出房间 虽然两套SDK每一个步骤的实现方式不同，但是基本都是遵循同一套流程。王二狗猛然发现，这不就是给模板方法模式准备的场景嘛，于是乎撸起袖子就干了！
 */
public class TestDemo {

    public static void main(String[] args) {
        LivePlay tencentLive = new TencentLivePlay();
        tencentLive.seeLivePlay();

        System.out.println("");

        LivePlay jinShanLive = new JinShanLivePlay();
        jinShanLive.seeLivePlay();
    }

}
