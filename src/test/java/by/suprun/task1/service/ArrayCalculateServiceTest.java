package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.ArrayCalculateService;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCalculateServiceTest extends Assert {
    public static final int[] testArray = {1, 4, 5, 6};
    ArrayCalculateService arrayCalculateService = new ArrayCalculateService();


    @Test
    public void sumElementsOfArrayTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(testArray);
        int actualSum = arrayCalculateService.sumElementsOfArray(customArray);
        int expected = 16;
        assertEquals(actualSum, expected);
    }
}
