package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.ArraySortInterface;
import by.suprun.task1.validate.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService implements ArraySortInterface {
    ArrayValidator validator = new ArrayValidator();
    private static final Logger logger = LogManager.getLogger(ArraySortService.class);

    @Override
    public void bubbleSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method bubbleSort is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < tempArray.length - 1; j++) {
                if (tempArray[j] < tempArray[j - 1]) {
                    int temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        customArray.setArray(tempArray);
    }

    @Override
    public void quickSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method quickSort is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
    }

    @Override
    public void shellSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method shellSort is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
    }
}
