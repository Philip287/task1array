package by.suprun.task1.repository.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.repository.CustomCollectionRepository;
import by.suprun.task1.repository.Specification;

import java.util.Comparator;
import java.util.List;

public class CustomArrayRepository implements CustomCollectionRepository {
    @Override
    public void addArray(CustomArray customArray) {

    }

    @Override
    public void addAllArrays(List<CustomArray> customArrays) {

    }

    @Override
    public void removeArray(CustomArray customArray) {

    }

    @Override
    public void removeAllArrays(List<CustomArray> customArrays) {

    }

    @Override
    public CustomArray get(int index) {
        return null;
    }

    @Override
    public void set(int index, CustomArray customArray) {

    }

    @Override
    public List<CustomArray> querry(Specification specification) {
        return null;
    }

    @Override
    public List<CustomArray> sort(Comparator<CustomArray> comparator) {
        return null;
    }
}
