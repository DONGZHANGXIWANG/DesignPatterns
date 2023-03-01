package zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional;

import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.ComputerBuilder;
import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.impl.LenovoComputerBuilder;
import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.impl.MacComputerBuilder;

import java.rmi.dgc.Lease;

/**
 * 使用
 * 首先生成一个director (1)，然后生成一个目标builder (2)，接着使用director组装builder (3),组装完毕后使用builder创建产品实例 (4)。
 *
 * 对比
 *  可以看到，zhihu.A_PatternOfBuilder.A3_BuilderPattern.A_JavaObjType.MilkTea 使用方式是传统builder模式的变种，
 *  首先其省略了director 这个角色，将构建算法交给了client端，其次将builder 写到了要构建的产品类里面，最后采用了链式调用。
 */
public class TestComputer {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder computerBuilder = new MacComputerBuilder("M1处理器", "256");
        director.makeComputer(computerBuilder);
        Computer computer = computerBuilder.getComputer();
        System.out.println("Mac电脑:" + computer.toString());

        ComputerBuilder lenovo = new LenovoComputerBuilder("I7十二代", "512");
        director.makeComputer(lenovo);
        Computer computer1 = lenovo.getComputer();
        System.out.println("联想电脑" + computer1.toString());
    }

}
