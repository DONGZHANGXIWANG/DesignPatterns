package zhihu.C_PatternOfBehavior.C10_Template;

/**
 * 第一步：先定义一个模板类LivePlay,如下代码片段所示，其中的seeLivePlay()就是所谓的<模板方法>，为了不被子类overwrite，它被设置为final的，其定义了一个算法骨架。
 * 其中的login()是一个<实体方法>，里面是通用逻辑，所有的子类都是一样的。
 * 四个被abstract修饰的是抽象方法，这些方法是需要子类去根据自己的实际算法实现的，
 * 而pushVideoStream() 方法有一个默认的空实现，这个一般称为钩子方法，设计用来被其中<部分>需要的子类overwrite. 例如腾讯直播SDK提供了旁路推流的功能，而金山的没有提供，那么腾讯直播类就可以选择overwrite这个钩子方法，提供自己的实现。
 */
public abstract class LivePlay {

    // 模板方法
    public final void seeLivePlay() {
        login();
        openRoom();
        startAudioAndVideoStream();
        pushVideoStream();
        stopAudioAndVideoStream();
        closeRoom();
    }

    /*抽象方法*/
    // 进入房间
    protected abstract void openRoom();

    //关闭音视频流
    protected abstract void stopAudioAndVideoStream();

    //打开音视频流
    protected abstract void startAudioAndVideoStream();

    // 退出房间
    protected abstract void closeRoom();

    /* 钩子方法, 可以被需要的子类overwrite */
    //旁路推流，可以通过视频链接在浏览器中查看视频
    protected void pushVideoStream(){

    }

    // 实体方法
    private void login() {
        System.out.println("用户登录");
    }


}
