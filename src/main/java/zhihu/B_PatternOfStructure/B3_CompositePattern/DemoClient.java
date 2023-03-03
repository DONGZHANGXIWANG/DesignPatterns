package zhihu.B_PatternOfStructure.B3_CompositePattern;

import zhihu.B_PatternOfStructure.B3_CompositePattern.Component.OrganizationComponent;
import zhihu.B_PatternOfStructure.B3_CompositePattern.Component.leaf.FinanceDepartment;
import zhihu.B_PatternOfStructure.B3_CompositePattern.Component.leaf.ItDepartment;
import zhihu.B_PatternOfStructure.B3_CompositePattern.Composite.OrganizationComposite;

/**
 * 组合模式
 * 场景
 *      公司新接了个外包IT项目, 刚刚要求写一个"小软件"用来管理公司的组织架构
 *      此案例使用组合模式可解
 *
 * 测试
 *      我们来看看是否达到了我们的设计目的：以统一的接口操作单个对象与其组合对象。
 *      首先构建一个组合对象。模拟构建一家公司，公司下设财务部门和IT部门，还有一个天津分公司，而天津分公司又下设一个财务部门和IT部门。
 *      然后我确定查询这个公司任何部门的员工人数。我们可以看到在查询过程中，我们没有判断当前对象到底是什么部门对象，都是以统一的接口在操作。
 */
public class DemoClient {

    private static OrganizationComponent constructOrganization() {
        // 构建总部
        OrganizationComposite head = new OrganizationComposite("总公司");
        FinanceDepartment headFinance = new FinanceDepartment("总公司财务部");
        ItDepartment itDepartment = new ItDepartment("总公司It部");
        head.add(headFinance);
        head.add(itDepartment);

        // 构建分公司
        OrganizationComposite branch1 = new OrganizationComposite("天津分公司");
        FinanceDepartment financeDepartment = new FinanceDepartment("天津分公司财务部");
        ItDepartment itDepartment1 = new ItDepartment("天津分公司It部");
        branch1.add(financeDepartment);
        branch1.add(itDepartment1);

        // 将分公司添加到head中
        head.add(branch1);

        return head;
    }

    public static void main(String[] args) {
        OrganizationComponent org = constructOrganization();
        System.out.println(String.format("%s共有%d名员工", org.getName(), org.getStaffCount()));

        OrganizationComponent subOrg = org.getChild("天津分公司财务部");
        System.out.println(String.format("%s共有%d名员工", subOrg.getName(), subOrg.getStaffCount()));
    }

}
