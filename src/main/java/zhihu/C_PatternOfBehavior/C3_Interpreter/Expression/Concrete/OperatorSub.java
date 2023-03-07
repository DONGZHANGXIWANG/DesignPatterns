package zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Expression;

/**
 * 减法操作类
 */
public class OperatorSub extends OperatorInterpreter{

    public OperatorSub(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 加法类和减法类都继承自 Operator 类，在对他们进行解释时，将左右两边表达式解释出的值相加或相减即可。
     * @return
     */
    @Override
    public int interpreter() {
        return left.interpreter() - right.interpreter();
    }
}
