package zhihu.A_PatternOfBuilder.A4_PrototypePattern;

/**
 * 原型接口
 * 原型接口必须有一个可以克隆自己的方法，反回类型为Prototype
 */
public interface Prototype {

    Prototype copy();
    
}
