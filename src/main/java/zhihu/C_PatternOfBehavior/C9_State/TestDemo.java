package zhihu.C_PatternOfBehavior.C9_State;

import zhihu.C_PatternOfBehavior.C9_State.Context.JdLogistics;
import zhihu.C_PatternOfBehavior.C9_State.State.impl.OrderState;
import zhihu.C_PatternOfBehavior.C9_State.State.impl.ProductOutState;
import zhihu.C_PatternOfBehavior.C9_State.State.impl.TransportState;

/*
*
 * 状态模式
 * 注意和策略模式的区别
 *
 * demo场景
    最近王二狗又要过生日了，近两年他内心中是非常抗拒过生日的，因为每过一个生日就意味着自己又老一岁，离被辞退的35岁魔咒又近了一步。可惜时间是不以人的意志为转移的，任何人都阻止不了时间的流逝，所以该过还的过。令二狗比较欣慰的时，这次过生日老婆送了他一个自己一直想要的机械键盘作为生日礼物... 翠花于是在二狗生日前3天在京东上下了一个单...

 自从下单以来，二狗天天看物流状态信息，心心念念着自己的机械键盘快点到...

 这个物流系统就很适合使用状态模式来开发，因为此过程存在很多不同的状态，例如接单，出库，运输，送货，收货，评价等等。
 而订单在每个不同的状态下的操作可能都不一样，例如在接单状态下，商家就需要通知仓库拣货，通知用户等等操作，其他状态类似
 *
*/
public class TestDemo {

    public static void main(String[] args) {
        //状态的保持与切换者
        JdLogistics jdLogistics = new JdLogistics();

        //接单状态
        OrderState orderState = new OrderState();
        jdLogistics.setLogisticsState(orderState);
        jdLogistics.doAction();

        //出库状态
        ProductOutState productOutState = new ProductOutState();
        jdLogistics.setLogisticsState(productOutState);
        jdLogistics.doAction();

        //运输状态
        TransportState transportState = new TransportState();
        jdLogistics.setLogisticsState(transportState);
        jdLogistics.doAction();
    }

}
