package zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Concrete;

import zhihu.C_PatternOfBehavior.C3_Interpreter.Expression.Expression;

/**
 * 第二步：实现具体的解释器
 * 对数字类的解释实现起来相对比较简单：在 Number 类的构造函数中，先将传入的字符转换为对应的数字。在解释时将转换后的数字返回即可。
 */
public class NumberInterpreter implements Expression {

    private int number;

    public NumberInterpreter(char word) {
        switch (word) {
            case '零':
                number = 0;
                break;
            case '一':
                number = 1;
                break;
            case '二':
                number = 2;
                break;
            case '三':
                number = 3;
                break;
            case '四':
                number = 4;
                break;
            case '五':
                number = 5;
                break;
            case '六':
                number = 6;
                break;
            case '七':
                number = 7;
                break;
            case '八':
                number = 8;
                break;
            case '九':
                number = 9;
                break;
            default:
                break;
        }
    }

    @Override
    public int interpreter() {
        return number;
    }
}
