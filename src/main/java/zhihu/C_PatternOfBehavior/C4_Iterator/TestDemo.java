package zhihu.C_PatternOfBehavior.C4_Iterator;

import zhihu.C_PatternOfBehavior.C4_Iterator.Aggregate.AggregateClass;
import zhihu.C_PatternOfBehavior.C4_Iterator.dto.Student;

import java.util.Iterator;

/**
 * 迭代器模式
 *
 * demo场景
 *      在我们上大学的时候，无论哪一科的老师都喜欢在课前点名，为什么会这样呢？是因为老师不知道自己班级有几名学生吗？当然不是，恰恰是因为老师明知道自己班级有多少学生，但放眼望去到场的却寥寥无几...
 *      老师点名肯定是从头点到尾，对班里的每一个学生进行迭代...
 */
public class TestDemo {

    public static void main(String[] args) {
        AggregateClass cls= new AggregateClass();
        System.out.println("--------------开始点名--------------");
        Iterator<Student> iterator= cls.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
