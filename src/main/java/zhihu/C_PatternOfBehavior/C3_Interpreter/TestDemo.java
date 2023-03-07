package zhihu.C_PatternOfBehavior.C3_Interpreter;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Context.Calculator;

/**
 * 解释器模式
 *
 * 解释器模式较为晦涩难懂，但本文我们仍然深入浅出，通过一个简单的例子来学习解释器模式：使用中文编写出十以内的加减法公式。比如：
 * 输入“一加一”，输出结果 2
 * 输入“一加一加一”，输出结果 3
 * 输入“二加五减三”，输出结果 4
 * 输入“七减五加四减一”，输出结果 5
 * 输入“九减五加三减一”，输出结果 6
 *
 * 按照面向对象的编程思想，我们应该为公式中不同种类的元素建立一个对应的对象。那么我们先分析一下公式中的成员：
 *      数字：零到九 对应 0 ~ 9
 *      计算符：加、减 对应 +、-
 * 公式中仅有这两种元素，其中对于数字的处理比较简单，只需要通过switch-case将中文名翻译成阿拉伯数字即可。
 * 计算符怎么处理呢？计算符左右两边可能是单个数字，也可能是另一个计算公式。但无论是数字还是公式，两者都有一个共同点，那就是他们都会返回一个整数：数字返回其本身，公式返回其计算结果。
 * 所以我们可以根据这个共同点提取出一个返回整数的接口，数字和计算符都作为该接口的实现类。在计算时，使用栈结构存储数据，将数字和计算符统一作为此接口的实现类压入栈中计算。
 */
public class TestDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression1 = "一加一";
        String expression2 = "一加一加一";
        String expression3 = "二加五减三";
        String expression4 = "七减五加四减一";
        String expression5 = "九减五加三减一";
        // 输出： 一加一 等于 2
        System.out.println(expression1 + " 等于 " + calculator.calculate(expression1));
        // 输出： 一加一加一 等于 3
        System.out.println(expression2 + " 等于 " + calculator.calculate(expression2));
        // 输出： 二加五减三 等于 4
        System.out.println(expression3 + " 等于 " + calculator.calculate(expression3));
        // 输出： 七减五加四减一 等于 5
        System.out.println(expression4 + " 等于 " + calculator.calculate(expression4));
        // 输出： 九减五加三减一 等于 6
        System.out.println(expression5 + " 等于 " + calculator.calculate(expression5));
    }

}
