package by.suprun.task1.repository;

import by.suprun.task1.comparator.CustomArrayComparator;
import by.suprun.task1.creator.CreateCustomArray;
import by.suprun.task1.creator.imp.CreatorCustomArrayImpl;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.repository.impl.CustomArrayRepository;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CustomArrayRepositoryTest {

    @Test
    public void sort() throws CustomArrayException {
        CreatorCustomArrayImpl creatorCustomArray = CreatorCustomArrayImpl.getInstance();
        CustomArrayRepository repository = CustomArrayRepository.getInstance();
        CustomArray first = creatorCustomArray.createCustomArray(2, 1, 2, 3, 4);
        CustomArray second = creatorCustomArray.createCustomArray(1, 5, 6, 7, 8);
        CustomArray third = creatorCustomArray.createCustomArray(3, 9, 10, 11, 12);
        ArrayList<CustomArray> sortedArrays = new ArrayList<>();
        sortedArrays.add(first);
        sortedArrays.add(second);
        sortedArrays.add(third);
        repository.addArray(second);
        repository.addArray(first);
        repository.addArray(third);
        var actual = repository.sort(new CustomArrayComparator());
        Assert.assertEquals(actual, sortedArrays);
    }
}
