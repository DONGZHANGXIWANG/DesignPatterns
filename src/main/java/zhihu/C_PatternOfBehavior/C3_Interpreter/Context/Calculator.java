package zhihu.C_PatternOfBehavior.C3_Interpreter.Context;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete.NumberInterpreter;
import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete.OperatorAdd;
import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete.OperatorSub;
import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Expression;

import java.util.Stack;

/**
 * 第三步：数字类和计算符内都定义好了，这时我们只需要再编写一个计算类将他们综合起来，统一计算即可。
 */
public class Calculator {

    /**
     * 需要注意的是，入栈出栈过程并不会执行真正的计算，栈操作只是将表达式组装成一个嵌套的类对象而已。比如：
     * <p>
     * “一加一”表达式，经过入栈出栈操作后，生成的对象是 new Add(new Number('一'), new Number('一'))
     * “二加五减三”表达式，经过入栈出栈操作后，生成的对象是 ｀new Sub(new Add(new Number('二'), new Number('五')), new Number('三'))`
     *
     * @param expression
     * @return
     */
    public int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();
        // 在计算类中，我们使用栈结构保存每一步操作。遍历 expression 公式：
        for (int i = 0; i < expression.length(); i++) {
            char word = expression.charAt(i);
            switch (word) {
                //遇到计算符时，先将栈顶元素 pop 出来，再和下一个数字一起传入计算符的构造函数中，组成一个计算符公式压入栈中。
                case '加':
                    stack.push(new OperatorAdd(stack.pop(), new NumberInterpreter(expression.charAt(++i))));
                    break;
                case '减':
                    stack.push(new OperatorSub(stack.pop(), new NumberInterpreter(expression.charAt(++i))));
                    break;
                default:
                    //遇到数字则将其压入栈中；
                    stack.push(new NumberInterpreter(word));
                    break;
            }
        }
        //最后一步 stack.pop().interpreter()，将栈顶的元素弹出，执行 interpreter() ，这时才会执行真正的计算。
        return stack.pop().interpreter();
    }

}
