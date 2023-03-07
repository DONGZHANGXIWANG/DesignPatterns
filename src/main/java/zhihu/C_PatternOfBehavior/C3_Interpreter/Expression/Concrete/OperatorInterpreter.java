package zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Expression;

/**
 * 第二步：实现具体的解释器
 *
 * 无论是加法还是减法，他们都是对左右两个表达式进行操作，所以我们可以将计算符提取出共同的抽象父类：
 */
public abstract class OperatorInterpreter implements Expression {
    Expression left;
    Expression right;

    public OperatorInterpreter(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
