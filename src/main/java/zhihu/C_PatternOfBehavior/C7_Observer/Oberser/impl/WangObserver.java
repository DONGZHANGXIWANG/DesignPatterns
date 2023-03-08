package zhihu.C_PatternOfBehavior.C7_Observer.Oberser.impl;

import zhihu.C_PatternOfBehavior.C7_Observer.Oberser.TianGouObserser;

public class WangObserver implements TianGouObserser {
    @Override
    public void update(String msg) {
        if ("肚子好饿".equals(msg)) {
            System.out.println("二狗：半夜起来，翻墙出去步行2公里买女神最爱吃的小笼包... 上官：二狗，你真是个好人");
        } else if ("心情不好".equals(msg)) {
            System.out.println("二狗：官哭着述说渣男怎么欺负的她...整整3个小时，全程安慰... 上官：二狗，你真是个好人");
        } else {
            System.out.println("随叫随到...");
        }
    }
}
