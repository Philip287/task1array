package by.suprun.task1.repository.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.repository.Specification;

public class EqualToIdSpecification implements Specification {
    private int id;

    public EqualToIdSpecification(int newId) {
        id = newId;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getId() == id;
    }
}
