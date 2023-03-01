package zhihu.A_PatternOfBuilder.A4_PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型类
 * 这个类就是我们的原型类，准备被其他人克隆使用的，所以其实现Prototype 接口，具备克隆的能力。根据业务需求，克隆可以是浅克隆，也可以是深克隆。
 *
 * 我们假设此类含有一个存放内容的List，这些数据都是从数据库读取的相对比较耗时。假设我们要生成多篇不同报表，内容基本不变（这是要点，只有你需要的对象是可以基于原型对象的才有意义），头部要不同。
 */
public class Report implements Prototype{

    private List<String> parts;

    public Report() {
        this.parts = new ArrayList<>();
    }

    public Report(List<String> parts) {
        this.parts = parts;
    }

    //耗时的数据加载操作
    public void loadData() {
        parts.clear();
        parts.add("老夫聊发少年狂，左牵黄，右擎苍，锦帽貂裘，千骑卷平冈。");
        parts.add("为报倾城随太守，亲射虎，看孙郎。");
        parts.add("酒酣胸胆尚开张，鬓微霜，又何妨！持节云中，何日遣冯唐？");
        parts.add("会挽雕弓如满月，西北望，射天狼。");
    }

    public List<String> getContents() {
        return parts;
    }

    @Override
    public Prototype copy() {
        List<String> cloneList = new ArrayList<>(parts);
        return new Report(cloneList);
    }
}
