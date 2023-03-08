package zhihu.C_PatternOfBehavior.C7_Observer.Subject.impl;

import zhihu.C_PatternOfBehavior.C7_Observer.Oberser.TianGouObserser;
import zhihu.C_PatternOfBehavior.C7_Observer.Subject.GreenTeaBitchSubject;

import java.util.ArrayList;
import java.util.List;

public class ShangguanSubject implements GreenTeaBitchSubject {

    private List<TianGouObserser> tianDogs = new ArrayList<>();

    @Override
    public void add(TianGouObserser tianGouObserser) {
        tianDogs.add(tianGouObserser);
    }

    @Override
    public void remove(TianGouObserser tianGouObserser) {
        tianDogs.remove(tianGouObserser);
    }

    @Override
    public void notifyState(String state) {
        for (TianGouObserser tianGou : tianDogs){
            tianGou.update(state);
        }
    }
}
