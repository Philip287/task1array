package by.suprun.task1.creator.imp;

import by.suprun.task1.creator.CreateCustomArray;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.IdCustomArrayGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatorCustomArrayImpl implements CreateCustomArray {
    private static CreatorCustomArrayImpl instance;

    private CreatorCustomArrayImpl(){

    }

    public static CreatorCustomArrayImpl getInstance(){
        if (instance == null){
            instance = new CreatorCustomArrayImpl();
        }
        return instance;
    }
    Logger logger = LogManager.getLogger();

    @Override
    public CustomArray createCustomArray() {
        logger.info("New custom without anything array is created");
        return new CustomArray();
    }

    @Override
    public CustomArray createCustomArray(int id, int... array) throws CustomArrayException {
        logger.info("New custom array is created with two int parameters");
        return new CustomArray(id, array);
    }

    @Override
    public List<CustomArray> createCustomArrays(int id, List<int[]> arraysElements) throws CustomArrayException {
        logger.info("New custom array is created with int and list");
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
    public CustomArray createRandomArray(int lengthBoundary, int elementBoundary) throws CustomArrayException, NoSuchAlgorithmException {
        Random random = SecureRandom.getInstanceStrong();
        int length = random.nextInt(lengthBoundary);
        int id = IdCustomArrayGenerator.getNextId();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(elementBoundary);
        }
        return new CustomArray(id, arr);
    }
}
