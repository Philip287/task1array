package by.suprun.task1.creator;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

import java.util.List;

public interface CreateCustomArray {
    CustomArray createCustomArray();

    CustomArray createCustomArray(int... elements) throws CustomArrayException;

    List<CustomArray> createCustomArrays(List<int[]> arraysElements) throws CustomArrayException;
}
