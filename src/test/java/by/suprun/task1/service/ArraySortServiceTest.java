package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.CustomArraySortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortServiceTest {
    private final int[] TEST_ARRAY = {5, 2, 11, 9, 8};
    CustomArraySortImpl customArraySortImplTest = CustomArraySortImpl.getInstance();

    @Test
    public void bubbleSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(1, TEST_ARRAY);
        customArraySortImplTest.bubbleSort(customArray);
        CustomArray expected = new CustomArray(1, 2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
    }

    @Test
    public void insertionSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(1, TEST_ARRAY);
        customArraySortImplTest.insertionSort(customArray);
        CustomArray expected = new CustomArray(1, 2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
    }

    @Test
    public void selectionSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(1, TEST_ARRAY);
        customArraySortImplTest.selectionSort(customArray);
        CustomArray expected = new CustomArray(1, 2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
    }
}
