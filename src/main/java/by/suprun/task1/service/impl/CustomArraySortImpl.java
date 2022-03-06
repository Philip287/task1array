package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.CustomArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySortImpl implements CustomArraySortService {
    private static final Logger logger = LogManager.getLogger();
    private static CustomArraySortImpl instance;


    private CustomArraySortImpl() {

    }

    public static CustomArraySortImpl getInstance() {
        if (instance == null) {
            return new CustomArraySortImpl();
        }
        return instance;
    }

    @Override
    public void bubbleSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method bubbleSort is called");
        int[] tempArray = customArray.getArray();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] > tempArray[i + 1]) {
                    temp = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        customArray.setArray(tempArray);
    }

    @Override
    public void insertionSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method quickSort is called");
        int[] tempArray = customArray.getArray();
        for (int i = 1; i < tempArray.length; i++) {
            int current = tempArray[i];
            int j = i - 1;
            while (j >= 0 && current < tempArray[j]) {
                tempArray[j + 1] = tempArray[j];
                j--;
            }
            tempArray[j + 1] = current;
        }
        customArray.setArray(tempArray);
    }

    @Override
    public void selectionSort(CustomArray customArray) throws CustomArrayException {
        logger.info("Method shellSort is called");
        int[] tempArray = customArray.getArray();
        for (int i = 0; i < tempArray.length; i++) {
            int min = tempArray[i];
            int minId = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < min) {
                    min = tempArray[j];
                    minId = j;
                }
            }
            int temp = tempArray[i];
            tempArray[i] = min;
            tempArray[minId] = temp;
        }
        customArray.setArray(tempArray);
    }
}
