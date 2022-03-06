package by.suprun.task1.comparator;

import by.suprun.task1.entity.CustomArray;

import java.util.Comparator;

public class CustomArrayComparatorByID implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getId() - o2.getId();
    }
}
