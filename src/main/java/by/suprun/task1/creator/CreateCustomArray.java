package by.suprun.task1.creator;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

import java.util.List;

public interface CreateCustomArray {
    CustomArray createCustomArray();

    CustomArray createCustomArray(int id, int... elements) throws CustomArrayException;

    List<CustomArray> createCustomArrays(int id, List<int[]> arraysElements) throws CustomArrayException;

    CustomArray createRandomArray() throws CustomArrayException;
}
