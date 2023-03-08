package zhihu.C_PatternOfBehavior.C10_Template;

/**
 * 第二步：定义具体的实体类，根据情况overwrite相应的抽象方法和钩子方法。
 *
 * 由于金山SDK没有提供了旁路推流的功能，所以它不用覆写pushVideoStream()这个钩子方法,而只需要overwrite 抽象方法即可。
 */
public class JinShanLivePlay extends LivePlay{
    @Override
    protected void openRoom() {
        System.out.println("金山打开房间");
    }

    @Override
    protected void stopAudioAndVideoStream() {
        System.out.println("金山停止音视频流");
    }

    @Override
    protected void startAudioAndVideoStream() {
        System.out.println("金山打开音视频流");
    }

    @Override
    protected void closeRoom() {
        System.out.println("金山退出房间");
    }
}
