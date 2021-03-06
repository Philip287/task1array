package by.suprun.task1.repository.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.repository.CustomCollectionRepository;
import by.suprun.task1.repository.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomArrayRepository implements CustomCollectionRepository {
    private static CustomArrayRepository instance;
    private ArrayList<CustomArray> arrays;

    public CustomArrayRepository() {
        arrays = new ArrayList<>();
    }

    public static CustomArrayRepository getInstance() {
        if (instance == null) {
            instance = new CustomArrayRepository();
        }
        return instance;
    }

    public int getSize() {
        return arrays.size();
    }

    @Override
    public void addArray(CustomArray arrayEntity) {
        arrays.add(arrayEntity);
    }

    @Override
    public void addAllArrays(List<CustomArray> arrayEntities) {
        arrays.addAll(arrayEntities);
    }

    @Override
    public void removeArray(CustomArray arrayEntity) {
        arrays.remove(arrayEntity);
    }

    @Override
    public void removeAllArrays(List arrayEntities) {
        arrays.removeAll(arrayEntities);
    }

    @Override
    public CustomArray get(int index) {
        return arrays.get(index);
    }

    @Override
    public void set(int index, CustomArray customArray) {
        arrays.set(index, customArray);
    }

    public ArrayList<CustomArray> getRepository() {
        return arrays;
    }

    @Override
    public List<CustomArray> query(Specification specification) {
        List<CustomArray> list = arrays.stream().
                filter(specification::specify).
                collect(Collectors.toList());
        return list;
    }

    @Override
    public ArrayList<CustomArray> sort(Comparator<CustomArray> comparator) {
        List<CustomArray> list = arrays.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        return new ArrayList<>(list);
    }
}
