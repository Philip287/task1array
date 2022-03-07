package by.suprun.task1.entity;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.observer.CustomArrayEvent;
import by.suprun.task1.observer.CustomArrayObservable;
import by.suprun.task1.observer.CustomArrayObserver;
import by.suprun.task1.observer.impl.CustomArrayObserverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray implements CustomArrayObservable {
    private static final Logger logger = LogManager.getLogger();
    private CustomArrayObserverImpl customArrayObserver;
    private int[] array;
    private int id;

    public CustomArray() {
    }

    public CustomArray(int newId, int... array) throws CustomArrayException {
        if (array.length < 1) throw new CustomArrayException("Array must have 1 or mo elements.");
        this.array = array.clone();
        this.id = newId;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public void setId(int newId) {
        id = newId;
    }

    public int getId() {
        return id;
    }

    public int getArrayLength() {
        return array.length;
    }

    @Override
    public String toString() {
        if (array == null) {
            return "CustomArray is null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : array) {
            stringBuilder.append(a).append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CustomArray customArray = (CustomArray) obj;
        if (array.length != customArray.array.length) {
            return false;
        }
        return this.hashCode() == customArray.hashCode();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < array.length; i++) {
            hashCode = 31 * hashCode + array[i] * 2 + i;
        }
        return hashCode;
    }

    @Override
    public void attach(CustomArrayObserver observer) {
        if (customArrayObserver == null) {
            customArrayObserver = (CustomArrayObserverImpl) observer;
        } else {
            logger.error("Observer had been attached already");
        }
    }

    @Override
    public void detach(CustomArrayObserver observer) {
        if (customArrayObserver != null) {
            customArrayObserver = null;
        } else {
            logger.error("Observer hab not been used");
        }
    }

    @Override
    public void notifyObserver() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        if (customArrayObserver != null) {
            customArrayObserver.replaceStatistic(event);
            customArrayObserver.updateAvg(event);
            customArrayObserver.updateSum(event);
            customArrayObserver.updateMax(event);
            customArrayObserver.updateMin(event);
        }
    }

    public CustomArrayObserverImpl getCustomCollectionObserver() {
        return customArrayObserver;
    }

    public void setCustomArrayObserver(CustomArrayObserverImpl newCustomCollectionObserver) {
        customArrayObserver = newCustomCollectionObserver;
    }
}
