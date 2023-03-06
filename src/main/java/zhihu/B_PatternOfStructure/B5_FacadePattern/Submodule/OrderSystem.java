package zhihu.B_PatternOfStructure.B5_FacadePattern.Submodule;

/**
 * 第一步，确定需要调用的子模块
 */
public class OrderSystem {

    public String getOrderNum(){
        System.out.println("获取订单号");
        return "123456";
    }

}
