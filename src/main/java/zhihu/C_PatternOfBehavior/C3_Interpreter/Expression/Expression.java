package zhihu.C_PatternOfBehavior.C3_Interpreter.Expression;

/**
 * 第一步：数字和计算符公共的接口：
 * 上文已经说到，数字和计算符都属于表达式的一部分，他们的共同点是都会返回一个整数。从表达式计算出整数的过程，我们称之为解释（interpreter）。
 */
public interface Expression {
    
    int interpreter () ;
    
}
