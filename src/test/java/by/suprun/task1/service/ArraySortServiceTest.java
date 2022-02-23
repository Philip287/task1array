package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.ArraySortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortServiceTest {
    private static final Logger logger = LogManager.getLogger();
    ArraySortImpl arraySortImplTest = new ArraySortImpl();
    private final int[] TEST_ARRAY = {5, 2, 11, 9, 8};

    @Test
    public void bubbleSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        arraySortImplTest.bubbleSort(customArray);
        CustomArray expected = new CustomArray(2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
        logger.info("bubbleSortTest is end");
    }

    @Test
    public void insertionSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        arraySortImplTest.insertionSort(customArray);
        CustomArray expected = new CustomArray(2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
        logger.info("insertionSortTest is end");
    }

    @Test
    public void selectionSortTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        arraySortImplTest.selectionSort(customArray);
        CustomArray expected = new CustomArray(2, 5, 8, 9, 11);
        assertEquals(customArray, expected);
        logger.info("selectionSortTest is end");
    }
}
