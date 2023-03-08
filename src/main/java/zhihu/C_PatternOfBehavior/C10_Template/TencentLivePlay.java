package zhihu.C_PatternOfBehavior.C10_Template;

/**
 * 第二步：定义具体的实体类，根据情况overwrite相应的抽象方法和钩子方法。
 */
public class TencentLivePlay extends LivePlay{
    @Override
    protected void openRoom() {
        System.out.println("腾讯打开房间");
    }

    @Override
    protected void stopAudioAndVideoStream() {
        System.out.println("腾讯停止音视频流");
    }

    @Override
    protected void startAudioAndVideoStream() {
        System.out.println("腾讯打开音视频流");
    }

    @Override
    protected void closeRoom() {
        System.out.println("腾讯退出房间");
    }

    /**
     * 值得注意的是，由于腾讯SDK提供了旁路推流的功能，所以它overwrite了pushVideoStream()这个钩子方法.
     */
    @Override
    protected void pushVideoStream() {
        super.pushVideoStream();
        System.out.println("腾讯进行旁路推流");
    }
}
