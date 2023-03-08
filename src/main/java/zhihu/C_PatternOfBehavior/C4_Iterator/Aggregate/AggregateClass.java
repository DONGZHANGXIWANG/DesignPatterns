package zhihu.C_PatternOfBehavior.C4_Iterator.Aggregate;

import zhihu.C_PatternOfBehavior.C4_Iterator.dto.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 容器
 * 实现了Iterable 接口。然后内部类Itr作为迭代器。此类中我使用ArrayList 作为内部数据结构，后期也可以换成数组，链表，树，图等等，而使用者却不用关心这些内部表示，这就是迭代器的妙处所在。
 */
public class AggregateClass implements Iterable<Student> {

    private final List<Student> students = new ArrayList<>();

    public AggregateClass() {
        students.add(new Student("王二狗", 28));
        students.add(new Student("牛翠花", 20));
        students.add(new Student("林蛋大", 29));
    }

    public boolean addStudent(Student student){
        return students.add(student);
    }

    public boolean removeStudent(Student student){
        return students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Student> {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < students.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Student next() {
            Student student = students.get(index);
            index++;
            return student;
        }
    }
}
