package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.CustomArrayCalculateImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.OptionalDouble;

public class ArrayCalculateServiceTest extends Assert {
    private final int[] TEST_ARRAY = {5, 2, 8, 11, 9};
    CustomArrayCalculateImpl customArrayCalculateImpl = CustomArrayCalculateImpl.getInstance();


    @Test
    public void sumElementsOfArrayTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(1,TEST_ARRAY);
        OptionalDouble actualSum = customArrayCalculateImpl.sumElementsOfArray(customArray);
        int expected = 35;
        assertEquals(actualSum, expected);
    }

    @Test
    public void averageOfArrayTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(1,TEST_ARRAY);
        OptionalDouble actualAverage = customArrayCalculateImpl.averageOfArray(customArray);
        OptionalDouble expected = OptionalDouble.of(7.0);
        assertEquals(actualAverage, expected);
    }
}
