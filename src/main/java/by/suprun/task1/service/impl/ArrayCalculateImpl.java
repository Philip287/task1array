package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.ArrayCalculateService;
import by.suprun.task1.validate.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateImpl implements ArrayCalculateService {
    private static final ArrayValidator validator = new ArrayValidator();
    private static final Logger logger = LogManager.getLogger();
    private static ArrayCalculateImpl instance;

    private ArrayCalculateImpl() {

    }

    public static ArrayCalculateImpl getInstance() {
        if (instance == null) {
            return new ArrayCalculateImpl();
        }
        return instance;
    }

    @Override
    public int sumElementsOfArray(CustomArray customArray) throws CustomArrayException {
        logger.info("Method sumElementsOfArray is coled.");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int element : tempArray) {
            sum = (sum + element);
        }
        return sum;
    }

    @Override
    public double averageOfArray(CustomArray customArray) throws CustomArrayException {
        logger.info("Method averageOfArray is coled.");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        return (double) sumElementsOfArray(customArray) / tempArray.length;
    }
}
