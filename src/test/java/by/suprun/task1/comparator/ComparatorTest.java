package by.suprun.task1.comparator;

import by.suprun.task1.creator.imp.CreatorCustomArrayImpl;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.impl.IdCustomArrayGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ComparatorTest {
    @Test
    public void compareEqualArraysById() throws CustomArrayException {
        var comparator = new CustomArrayComparatorByID();
        int id = IdCustomArrayGenerator.getNextId();
        CustomArray firstArray = new CustomArray(id, 1, 2, 3, 4, 5);
        CustomArray secondArray = new CustomArray(id, 1, 2, 3, 4, 5);
        int actual = comparator.compare(firstArray, secondArray);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void compareNonEqualArraysById() throws CustomArrayException {
        var comparator = new CustomArrayComparatorByID();
        int firstId = IdCustomArrayGenerator.getNextId();
        int secondId = IdCustomArrayGenerator.getNextId();
        CustomArray firstArray = new CustomArray(firstId, 1, 2, 3, 4, 5);
        CustomArray secondArray = new CustomArray(secondId, 1, 2, 3, 4, 5);
        int actual = comparator.compare(firstArray, secondArray);
        int expected = firstId - secondId;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareEqualCustomArrays() throws CustomArrayException {
        var comparator = new CustomArrayComparator();
        int id = IdCustomArrayGenerator.getNextId();
        CustomArray firstArray = new CustomArray(id, 1, 2, 3, 4, 5);
        CustomArray secondArray = new CustomArray(id, 1, 2, 3, 4, 5);
        int actual = comparator.compare(firstArray, secondArray);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void compareCustomArraysWithEqualArraysButDifferenceInId() throws CustomArrayException {
        var comparator = new CustomArrayComparator();
        int firstId = IdCustomArrayGenerator.getNextId();
        int secondId = IdCustomArrayGenerator.getNextId();
        CustomArray firstArray = new CustomArray(firstId, 1, 2, 3, 4, 5);
        CustomArray secondArray = new CustomArray(secondId, 1, 2, 3, 4, 5);
        int actual = comparator.compare(firstArray, secondArray);
        int expected = firstId - secondId;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareNonEqualCustomArrays() throws NoSuchAlgorithmException, CustomArrayException {
        var comparator = new CustomArrayComparator();
        CreatorCustomArrayImpl creatorCustomArrayImpl = CreatorCustomArrayImpl.getInstance();
        CustomArray firstArray = creatorCustomArrayImpl.createRandomArray(100, 200);
        CustomArray secondArray = creatorCustomArrayImpl.createRandomArray(10, 15);
        int actual = comparator.compare(firstArray, secondArray);
        int expected = Arrays.equals(firstArray.getArray(), secondArray.getArray()) ?
                firstArray.getId() - secondArray.getId() :
                Arrays.compare(firstArray.getArray(), secondArray.getArray());
        Assert.assertEquals(actual, expected);
    }
}
