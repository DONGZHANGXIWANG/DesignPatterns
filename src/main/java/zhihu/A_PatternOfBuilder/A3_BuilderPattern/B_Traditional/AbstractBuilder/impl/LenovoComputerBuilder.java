package zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.impl;

import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.ComputerBuilder;
import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.Computer;

/**
 * 实体构建者类，我们可以根据要构建的产品种类产生多了实体构建者类，这里我们需要构建两种品牌的电脑，苹果电脑和联想电脑，所以我们生成了两个实体构建者类。
 */
public class LenovoComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
