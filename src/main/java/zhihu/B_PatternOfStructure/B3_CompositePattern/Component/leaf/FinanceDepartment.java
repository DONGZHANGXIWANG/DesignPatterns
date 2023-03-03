package zhihu.B_PatternOfStructure.B3_CompositePattern.Component.leaf;

import zhihu.B_PatternOfStructure.B3_CompositePattern.Component.OrganizationComponent;

/**
 * 第三步 ： 叶子节点（存在多个）
 * 叶子节点就是单个对象了，我们要使用合适的方式处理那些叶子节点不支持的对外接口方法。因为用户使的时候只会看到对外暴露的统一接口，他不知道此对象是叶子节点还是组合对象。
 */
public class FinanceDepartment extends OrganizationComponent {

    public FinanceDepartment(String name) {
        super(name);
    }

    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException(this.getName() + "已经是最基本部门，无法增加下属部门");
    }

    public OrganizationComponent getChild(String orgName) {
        if (getName().equals(orgName)) {
            return this;
        }
        return null;
    }

    public int getStaffCount() {
        return 14;
    }
}
