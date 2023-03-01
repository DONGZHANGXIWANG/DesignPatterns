package zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional;

import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder.ComputerBuilder;

/**
 * 指导类
 *
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }

}
