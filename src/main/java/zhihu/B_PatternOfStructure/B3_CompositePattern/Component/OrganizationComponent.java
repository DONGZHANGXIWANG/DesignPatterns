package zhihu.B_PatternOfStructure.B3_CompositePattern.Component;

/**
 * 第一步：设计一个个体与组合通用的接口
 */
public abstract class OrganizationComponent {

    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void add (OrganizationComponent organizationComponent);

    public abstract OrganizationComponent getChild(String orgName);

    public abstract int getStaffCount();
}
