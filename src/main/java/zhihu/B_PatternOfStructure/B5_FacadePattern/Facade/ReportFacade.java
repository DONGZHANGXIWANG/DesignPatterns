package zhihu.B_PatternOfStructure.B5_FacadePattern.Facade;

import zhihu.B_PatternOfStructure.B5_FacadePattern.Submodule.DeliverySystem;
import zhihu.B_PatternOfStructure.B5_FacadePattern.Submodule.OrderSystem;
import zhihu.B_PatternOfStructure.B5_FacadePattern.Submodule.PaymentSystem;

public class ReportFacade {

    public void generateReport() {
        OrderSystem orderSystem = new OrderSystem();
        PaymentSystem paymentSystem = new PaymentSystem(orderSystem);
        DeliverySystem deliverySystem = new DeliverySystem();
        final String orderNum = orderSystem.getOrderNum();
        System.out.println(String.format("\n报表\n--------------------------------------------\n" +
                        "订单号：%s | 金额：%s元 | 配送耗时：%s分钟",
                orderNum,
                paymentSystem.getOrderAccount(orderNum).toPlainString(),
                String.valueOf(deliverySystem.getDeliveryTime() / 60)));
    }

}
