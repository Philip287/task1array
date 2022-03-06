package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.service.CustomArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;

public class CustomArrayCalculateImpl implements CustomArrayCalculateService {
    private static final Logger logger = LogManager.getLogger();
    private static CustomArrayCalculateImpl instance;

    private CustomArrayCalculateImpl() {

    }

    public static CustomArrayCalculateImpl getInstance() {
        if (instance == null) {
            return new CustomArrayCalculateImpl();
        }
        return instance;
    }

    @Override
    public OptionalDouble sumElementsOfArray(CustomArray customArray) {
        logger.info("Method sumElementsOfArray is coled.");
        if (customArray.getArrayLength() == 0) {
            return OptionalDouble.empty();
        }
        int[] tempArray = customArray.getArray();
        double sum = 0;
        for (int element : tempArray) {
            sum = (sum + element);
        }
        return OptionalDouble.of(sum);
    }

    @Override
    public OptionalDouble averageOfArray(CustomArray customArray) {
        logger.info("Method averageOfArray is coled.");
        if (customArray.getArrayLength() == 0) {
            return OptionalDouble.empty();
        }
        int[] tempArray = customArray.getArray();
        double sum = 0;
        for (int element : tempArray) {
            sum = (sum + element);
        }
        return OptionalDouble.of(sum / tempArray.length);
    }


}
