package zhihu.C_PatternOfBehavior.C5_Mediator;

import zhihu.C_PatternOfBehavior.C5_Mediator.Mediator.PlayGroupMediator;
import zhihu.C_PatternOfBehavior.C5_Mediator.Play.Player;

/**
 * 中介者模式
 *
 * Demo场景
 * 在我们打麻将时，每两个人之间都可能存在输赢关系。如果每笔交易都由输家直接发给赢家，就会出现一种网状耦合关系。
 * 每两位玩家需要进行交易时，都会增加程序耦合度，相当于每位玩家都需要和其他所有玩家打交道，这是一种不好的做法。
 * 此时，我们可以引入一个中介类——微信群，只要输家将自己输的钱发到微信群里，赢家从微信群中领取对应金额即可。
 */
public class TestDemo {

    public static void main(String[] args) {
        PlayGroupMediator group = new PlayGroupMediator();
        Player player1 = new Player(group);
        Player player2 = new Player(group);
        Player player3 = new Player(group);
        Player player4 = new Player(group);

        // player1 赢了 5 元
        player1.payment(5);
        // player2 赢了 20 元
        player2.payment(20);
        // player3 输了 12 元
        player3.payment(-12);
        // player4 输了 3 元
        player4.payment(-3);

        // 输出：四人剩余的钱：105,120,88,97
        System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + "," + player4.money);
    }

}
