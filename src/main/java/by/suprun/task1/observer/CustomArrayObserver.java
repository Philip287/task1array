package by.suprun.task1.observer;

import by.suprun.task1.observer.impl.CustomArrayEvent;

public interface CustomArrayObserver {
    void replaceStatistic(CustomArrayEvent event);

    void updateMin(CustomArrayEvent event);

    void updateMax(CustomArrayEvent event);

    void updateAvg(CustomArrayEvent event);

    void updateSum(CustomArrayEvent event);
}
