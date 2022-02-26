package by.suprun.task1.creator.imp;

import by.suprun.task1.creator.CreateCustomArray;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CreatorCustomArrayImpl implements CreateCustomArray {
    Logger logger = LogManager.getLogger();

    @Override
    public CustomArray createCustomArray() {
        logger.info("New custom array is created");
        return new CustomArray();
    }

    @Override
    public CustomArray createCustomArray(int... array) throws CustomArrayException {
        logger.info("New custom array is created");
        return new CustomArray(array);
    }

    @Override
    public List<CustomArray> createCustomArrays(List<int[]> arraysElements) throws CustomArrayException {
        logger.info("New custom array is created");
        List<CustomArray> customArray = new ArrayList<>();
        if (arraysElements == null) {
            return customArray;
        }
        for (int[] elements : arraysElements) {
            customArray.add(new CustomArray(elements));
        }
        return customArray;
    }
}
