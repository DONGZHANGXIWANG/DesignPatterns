package zhihu.B_PatternOfStructure.B2_BrigePattern;


import zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.RefinedCoffee;
import zhihu.B_PatternOfStructure.B2_BrigePattern.Abstraction.impl.LargeCoffee;
import zhihu.B_PatternOfStructure.B2_BrigePattern.Implementor.impl.Milk;

/**
 * 桥接模式可以看作是策略模式的升级
 *
 * 业务场景
 * 星巴克一开始提需求的时候只有正常杯（中杯），原味和加糖这几种选择，使用了策略。
 * 后面准备增加两个容量规格的咖啡，大杯和小杯，还是按照策略模式增加实现类？
 * 结果：加着加着就慌了，共需要3x2=6个类啊，大杯原味和加糖，中杯原味和加糖，小杯原味和加糖。万一过段时间那二笔客户又要出加奶，加蜂蜜等等口味，说不定还有迷你杯，女神杯等等规格的咖啡，那我这边的类不就爆炸了吗？
 *
 * 此场景桥接模式正合适，这里有两个变化维度，咖啡的容量和口味，而且都需要独立变化。如果使用继承的方式，随着变化类就会急剧的增加。你可以将容量理解为抽象部分，而口味理解为实现部分，这两个部分需要桥接。
 *
 * 当前业务场景，认为可以将咖啡的容量作为抽象化Abstraction，而咖啡口味为实现化Implementor
 */
public class DemoTest {

    public static void main(String[] args) {
        // 点两杯加奶的大杯咖啡
        RefinedCoffee coffee = new LargeCoffee(new Milk());
        // 先用抽象化规定的方法
        coffee.orderCoffee(2);
        // 再执行扩展抽象化的方法
        coffee.checkQuality();
    }


}
