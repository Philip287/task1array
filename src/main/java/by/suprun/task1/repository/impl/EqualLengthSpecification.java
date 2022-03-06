package by.suprun.task1.repository.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.repository.Specification;

public class EqualLengthSpecification implements Specification {
    private int length;

    public EqualLengthSpecification(int newLength){
        length = newLength;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getArrayLength() == length;
    }
}
