package by.suprun.task1.repository.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.repository.Specification;
import by.suprun.task1.service.impl.CustomArrayCalculateImpl;

public class LesserSumSpecification implements Specification {
    private long sum;

    public LesserSumSpecification(long sumTemp) {
        sum = sumTemp;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        var customArrayCalculateImpl = CustomArrayCalculateImpl.getInstance();
        if (!(customArrayCalculateImpl.sumElementsOfArray(customArray).isPresent())) {
            return false;
        }
        return (customArrayCalculateImpl.sumElementsOfArray(customArray).getAsDouble() < sum);
    }
}
