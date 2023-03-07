package zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Expression;

/**
 * 加法操作类
 */
public class OperatorAdd extends OperatorInterpreter{
    public OperatorAdd(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
