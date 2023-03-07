package zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler;

/**
 * 第一，设计一个所有处理器都要实现的接口
 */
public interface BudgetHandler {

    /**
     * 其中setNextHandler(BudgetHandler)方法负责设置下一个处理器，以便在自己不能处理此请求的情况下，将请求交给下一个处理器。
     *
     * @param nextHandler
     */
    void setNextHandler(BudgetHandler nextHandler);

    /**
     * handle(int) 方法负责处理请求。
     *
     * @param amount
     * @return
     */
    boolean handle(int amount);
}
