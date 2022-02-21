package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.ArrayFindInterface;
import by.suprun.task1.validate.iml.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFindService implements ArrayFindInterface {
    private static final ArrayValidator validator = new ArrayValidator();
    private static final Logger logger = LogManager.getLogger(ArrayFindService.class.getName());

    @Override
    public int arrayMin(CustomArray customArray) throws CustomArrayException {
        logger.info("Method minimum is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        int minElement = tempArray[0];
        for (int elementOfArray : tempArray) {
            if (elementOfArray < minElement) {
                minElement = elementOfArray;
            }
        }
        return minElement;
    }

    @Override
    public int arrayMax(CustomArray customArray) throws CustomArrayException {
        logger.info("Method maximum is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        int maxElement = tempArray[0];
        for (int elementOfArray : tempArray) {
            if (elementOfArray > maxElement) {
                maxElement = elementOfArray;
            }
        }
        return maxElement;
    }

    @Override
    public int countNegativeNumbersInArray(CustomArray customArray) throws CustomArrayException {
        logger.info("Method countNegativeNumbersInArray is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int elementOfArray : tempArray) {
            if (elementOfArray < 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countPositiveNumbersInArray(CustomArray customArray) throws CustomArrayException {
        logger.info("Method countPositiveNumbersInArray is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int elementOfArray : tempArray) {
            if (elementOfArray > 0) {
                count++;
            }
        }
        return count;
    }
}
