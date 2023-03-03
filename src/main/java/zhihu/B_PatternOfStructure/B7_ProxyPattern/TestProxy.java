package zhihu.B_PatternOfStructure.B7_ProxyPattern;

/**
 * 代理模式
 *
 * 业务场景
 *
 * 在 桥接模式 中提到林蛋大公司接了星巴克咖啡系统项目。林蛋大在王二狗的指导下使用《桥接模式》实现了星巴克要求的各种下单功能：大杯原味、大杯加糖、大杯加奶；中杯原味、中杯加糖、中杯加奶；小杯原味、小杯加糖、小杯加奶。
 * 刚舒服了没两天，项目经理就来找蛋大了：蛋大啊，现在用户的口味太刁，好多都要同时加奶，加糖，有的还要加蜂蜜，咱们目前这个实现不支持，你去改一下。
 * 对了，有些用户要求先加糖再加奶，而一些用户要求先加奶然后再加糖，顺序不能乱！
 *，
 * 开始分析需求：假设我们有一个原味咖啡的类 OriginalCoffee， 目前的需求就是要《动态的给这个类的一些实例增加一些额外功能》，此处就是动态的对某些咖啡制作过程增加新的流程，例如加奶，加糖，而有的咖啡却保持原味不变。
 *
 * 这种需求要是通过继承的方式就不太好实现，因为咖啡制作过程是动态变化的。例如有的需要原味咖啡，有的需要加奶咖啡，有的需要加糖咖啡，而有的需要先加奶再加糖咖啡，而有的需要先加糖再加奶的咖啡，。。。
 * 这是一个《《排列组合》》问题，如果使用类继承的方式实现，必须预先将所有可能组合都想清楚，然后生成相应的子类，随着咖啡口味的增多，以及添加顺序的改变，几乎是不可扩展和维护的。
 *
 * 经过需求分析，二狗锁定了装饰者模式来实现此需求。原味咖啡是本质，而加奶，加糖都是在装饰这个本质的东西，再怎么加东西咖啡还是咖啡。
 *
 */
public class TestProxy {



}
