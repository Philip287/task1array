package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.CustomArrayFindService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;

public class CustomArrayFindImpl implements CustomArrayFindService {
    private static final Logger logger = LogManager.getLogger();
    private static CustomArrayFindImpl instance;

    private CustomArrayFindImpl() {

    }

    public static CustomArrayFindImpl getInstance() {
        if (instance == null) {
            return new CustomArrayFindImpl();
        }
        return instance;
    }

    @Override
    public OptionalInt arrayMin(CustomArray customArray) throws CustomArrayException {
        logger.info("Method minimum is called");
        int[] tempArray = customArray.getArray();
        if (tempArray.length == 0) {
            return OptionalInt.empty();
        } else {
            int minElement = tempArray[0];
            for (int elementOfArray : tempArray) {
                if (elementOfArray < minElement) {
                    minElement = elementOfArray;
                }
            }
            return OptionalInt.of(minElement);
        }
    }

    @Override
    public OptionalInt arrayMax(CustomArray customArray) throws CustomArrayException {
        logger.info("Method maximum is called");
        int[] tempArray = customArray.getArray();
        if (tempArray.length == 0) {
            return OptionalInt.empty();
        } else {
            int maxElement = tempArray[0];
            for (int elementOfArray : tempArray) {
                if (elementOfArray > maxElement) {
                    maxElement = elementOfArray;
                }
            }
            return OptionalInt.of(maxElement);
        }
    }

    @Override
    public int countNegativeNumbersInArray(CustomArray customArray) throws CustomArrayException {
        logger.info("Method countNegativeNumbersInArray is called");
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
