package zhihu.B_PatternOfStructure.B5_FacadePattern;

import zhihu.B_PatternOfStructure.B5_FacadePattern.Facade.ReportFacade;

/**
 * 外观模式
 *
 * 场景
 *  王二狗公司大老板最近突然对他们正在开发的商城项目感了兴趣，所以要求他们出各种各样的报表。这可苦了二狗他们了，因为大老板要求的报表数据来自不同的子系统，这些子系统相互之间还有依赖，要想获得一份完整的报表，需要访问好多个模块...
 *  前端负责生成报表的那小子都怒了：后端是一帮sb吗？我就拿几个报表数据丫的让我先调这个API再调那个API，我tm就生成一份报表，前前后后调用了十几个API，涉及好几个系统，我看你们都tm应该A雷劈！二狗他们也不敢说话，确实比较扯，最后二狗决定要扭转这种不利的局面，经过分析，他选择了外观设计模式。
 *
 */
public class TestFacade {

    public static void main(String[] args) {
        new ReportFacade().generateReport();
    }

}
