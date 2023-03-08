package zhihu.C_PatternOfBehavior.C4_Iterator.Iterator;

import java.util.Iterator;

/**
 * 第一步：确定迭代器
 *
 * 由于Java已经天然支持了迭代器模式，我们直接使用就好了。主要涉及如下两个接口，看起来好简单对不对？对啊，本来也没多难。
 * public interface Iterator<E> {
 *     boolean hasNext();
 *     E next();
 *
 *    //java8后加入的default方法
 *     ...
 * }
 * public interface Iterable<T> {
 *     Iterator<T> iterator();
 *
 *    //java8后加入的default方法
 *     ...
 * }
 *
 * 如果我们要使自己的类支持迭代功能，只需要实现Iterable 接口，而这个接口仅仅是要求实现一个方法，提供一个迭代器。
 * 而这个迭代器要实现Iterator接口，所以我们唯一需要做的就是提供一个实现了Iterator接口的类而已。
 */
public class IteratorDemo implements Iterator,Iterable {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
