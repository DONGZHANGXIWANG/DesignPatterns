package zhihu.B_PatternOfStructure.B5_FacadePattern.Submodule;

import java.math.BigDecimal;

public class PaymentSystem {

    private OrderSystem orderSystem;

    public PaymentSystem(OrderSystem orderSystem) {
        this.orderSystem = orderSystem;
    }

    public BigDecimal getOrderAccount(String orderNum) {
        System.out.println(String.format("获取订单%s支付金额", orderNum));
        return new BigDecimal(500);
    }

}
