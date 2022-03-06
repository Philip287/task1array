package by.suprun.task1.comparator;

import by.suprun.task1.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class CustomArrayComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return Arrays.equals(o1.getArray(), o2.getArray())
                ? (o1.getId() - o2.getId()) : Arrays.compare(o1.getArray(), o2.getArray());
    }
}
