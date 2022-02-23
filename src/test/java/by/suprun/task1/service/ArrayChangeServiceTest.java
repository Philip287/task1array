package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.ArrayChangeImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayChangeServiceTest extends Assert {
    private static final Logger logger = LogManager.getLogger(ArrayChangeImpl.class.getName());
    private static ArrayChangeImpl arrayChangeServiceTest = new ArrayChangeImpl();
    private final int[] TEST_ARRAY = {5, 2, 8, 11, 9};

    @Test
    public void changeElementTest() throws CustomArrayException {
        CustomArray customArray = new CustomArray(TEST_ARRAY);
        int position = 0;
        int elementToChange = 0;
        arrayChangeServiceTest.changeElement(customArray, position, elementToChange);
        CustomArray expected = new CustomArray(0, 2, 8, 11, 9);
        assertEquals(customArray, expected);
        logger.info("ArrayChangeServiceTest is end");
    }
}
