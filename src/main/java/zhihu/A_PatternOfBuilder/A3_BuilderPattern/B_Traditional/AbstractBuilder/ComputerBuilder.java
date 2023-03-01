package zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.AbstractBuilder;

import zhihu.A_PatternOfBuilder.A3_BuilderPattern.B_Traditional.Computer;

public abstract class ComputerBuilder {

    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();


    public abstract Computer getComputer();

}
