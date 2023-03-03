package zhihu.B_PatternOfStructure.B3_CompositePattern.Composite;

import zhihu.B_PatternOfStructure.B3_CompositePattern.Component.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * 第二步： 组合对象，里面持有一个List<Component>。
 */
public class OrganizationComposite extends OrganizationComponent {

    // 很关键，体现了组合的思想
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public OrganizationComposite(String name) {
        super(name);
    }

    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    public OrganizationComponent getChild(String orgName) {
        for (OrganizationComponent organizationComponent : organizationComponents) {
            OrganizationComponent child = organizationComponent.getChild(orgName);
            if (null != child) {
                return child;
            }
        }
        return null;
    }

    public int getStaffCount() {
        return 0;
    }
}
