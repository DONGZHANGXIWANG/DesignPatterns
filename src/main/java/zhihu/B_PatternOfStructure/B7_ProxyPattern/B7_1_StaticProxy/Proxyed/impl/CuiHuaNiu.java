package zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.impl;

import zhihu.B_PatternOfStructure.B7_ProxyPattern.B7_1_StaticProxy.Proxyed.LawSuit;

public class CuiHuaNiu implements LawSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下：%s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山，%s还牛翠花血汗钱","马旭"));
    }
}
