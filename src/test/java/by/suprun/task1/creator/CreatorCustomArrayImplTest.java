package by.suprun.task1.creator;

import by.suprun.task1.creator.imp.CreatorCustomArrayImpl;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.IdCustomArrayGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CreatorCustomArrayImplTest {

    @Test
    public void testOfCreation() throws CustomArrayException {
        CreatorCustomArrayImpl creatorCustomArray = CreatorCustomArrayImpl.getInstance();
        int tempId = IdCustomArrayGenerator.getNextId();
        CustomArray firstArray = creatorCustomArray.createCustomArray(tempId, 1, 2, 3, 4, 5);
        CustomArray secondArray = creatorCustomArray.createCustomArray(tempId, 1, 2, 3, 4, 5);
        Assert.assertEquals(firstArray, secondArray);
    }

    @Test
    public void testRandomCreation() throws NoSuchAlgorithmException, CustomArrayException {
        CreatorCustomArrayImpl creatorCustomArray = CreatorCustomArrayImpl.getInstance();
        CustomArray array = creatorCustomArray.createRandomArray(1000, 200);
        int[] arr = array.getArray();
        long invalidValues = array.getArrayLength() <= 1000 ? 0 : 1;
        long invalidElements = Arrays.stream(arr, 0, arr.length).filter(el -> (el > 200)).count();
        Assert.assertEquals(invalidElements + invalidValues, 0);

    }
}
