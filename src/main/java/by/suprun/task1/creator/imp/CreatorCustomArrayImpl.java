package by.suprun.task1.creator.imp;

import by.suprun.task1.creator.CreateCustomArray;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatorCustomArrayImpl implements CreateCustomArray {
    Logger logger = LogManager.getLogger();

    @Override
    public CustomArray createCustomArray() {
        logger.info("New custom array is created");
        return new CustomArray();
    }

    @Override
    public CustomArray createCustomArray(int id, int... array) throws CustomArrayException {
        logger.info("New custom array is created");
        return new CustomArray(id, array);
    }

    @Override
    public List<CustomArray> createCustomArrays(int id, List<int[]> arraysElements) throws CustomArrayException {
        logger.info("New custom array is created");
        List<CustomArray> customArray = new ArrayList<>();
        if (arraysElements == null) {
            return customArray;
        }
        for (int[] elements : arraysElements) {
            customArray.add(new CustomArray(id, elements));
        }
        return customArray;
    }


    @Override
    public CustomArray createRandomArray() throws CustomArrayException {
        Random random = new Random();
        int length = random.nextInt(15);
        int id = random.nextInt(15);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(15);
        }
        return new CustomArray(id, arr);
    }
}
