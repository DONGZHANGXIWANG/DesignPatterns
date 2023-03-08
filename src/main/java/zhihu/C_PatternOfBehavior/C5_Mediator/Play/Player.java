package zhihu.C_PatternOfBehavior.C5_Mediator.Play;

import zhihu.C_PatternOfBehavior.C5_Mediator.Mediator.PlayGroupMediator;

public class Player {

    public int money = 100;

    /**
     * 玩家只和中介关联，不和其他玩家直接关联
     */
    public PlayGroupMediator playGroupMediator;


    public Player(PlayGroupMediator playGroupMediator) {
        this.playGroupMediator = playGroupMediator;
    }

    public void payment(int money) {
        playGroupMediator.money += money;
        this.money += money;
    }
}
