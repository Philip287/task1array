package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayCalculateServiceTest extends Assert {
    ArrayCalculateService arrayCalculateService = new ArrayCalculateService();
    private static final Logger logger = LogManager.getLogger(ArrayCalculateServiceTest.class.getName());
    private final int[] TEST_ARRAY = {5, 2, 8, 11, 9};

    @Test
    public void sumElementsOfArrayTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        int actualSum = arrayCalculateService.sumElementsOfArray(customArray);
        int expected = 35;
        assertEquals(actualSum, expected);
        logger.info("SumElementsOfArrayTest is end");
    }

    @Test
    public void averageOfArrayTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        double actualAverage = arrayCalculateService.averageOfArray(customArray);
        double expected = 7.0;
        assertEquals(actualAverage, expected, 0.0);
        logger.info("AverageOfArrayTest() is end");
    }
}
