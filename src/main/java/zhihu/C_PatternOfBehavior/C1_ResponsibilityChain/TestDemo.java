package zhihu.C_PatternOfBehavior.C1_ResponsibilityChain;

import zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler.impl.CFO;
import zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler.impl.GroupLeader;
import zhihu.C_PatternOfBehavior.C1_ResponsibilityChain.handler.impl.Manager;

/**
 * 责任链
 *
 * Demo场景
 *
 * 王二狗本来是干Android开发的，最近公司想让他把IOS的活也干了，但是Windows笔记本不能开发IOS，所以二狗提出买一台Mac笔记本电脑。这花钱的事需要领导审批，而每个领导权限不一样，能够审批的最大金额有限制。二狗首先肯定是向自己的小组leader提出，但是由于金额太大，超出了他的审批权限。于是小组领导就去找自己的领导，部门经理，但是部门经理也权限不够，最后到了CFO那里...
 * 王二狗遇到的情况就非常适合使用责任链模式。二狗这个预算申请的请求，事先不知道会由哪层领导处理，而各层领导的审批职责就好像铁链一样连接在一起，一个预算请求沿着这条链一直往上传... 让我们用代码来实现上面的场景吧。
 *
 */
public class TestDemo {

    public static void main(String[] args) {
        GroupLeader leader = new GroupLeader();
        Manager manager = new Manager();
        CFO cfo = new CFO();

        leader.setNextHandler(manager);
        manager.setNextHandler(cfo);

        System.out.println(String.format("领导您好：由于开发需求，需要购买一台Mac笔记本电脑，预算为%d 望领导批准", 95000));
        if (leader.handle(95000)) {
            System.out.println("谢谢领导");
        } else {
            System.out.println("巧妇难为无米之炊，只能划船了...");
        }

    }

}
