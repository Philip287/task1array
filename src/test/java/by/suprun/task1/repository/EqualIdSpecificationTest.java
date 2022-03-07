package by.suprun.task1.repository;

import by.suprun.task1.creator.CreateCustomArray;
import by.suprun.task1.creator.imp.CreatorCustomArrayImpl;
import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.repository.impl.CustomArrayRepository;
import by.suprun.task1.repository.impl.EqualToIdSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;


public class EqualIdSpecificationTest {
    EqualToIdSpecification specification = new EqualToIdSpecification(1000);

    @Test
    public void specifyTest() throws CustomArrayException, NoSuchAlgorithmException {
        CustomArrayRepository repository = CustomArrayRepository.getInstance();
        CreatorCustomArrayImpl creatorCustomArray = CreatorCustomArrayImpl.getInstance();
        CustomArray customArray = creatorCustomArray.createCustomArray(100000, 1, 2, 3);
        repository.addArray(customArray);
        for (int i = 5; i > 0; i--) {
            CustomArray temp = creatorCustomArray.createRandomArray(i*10, i*33);
            repository.addArray(temp);
        }
        Assert.assertEquals(customArray, repository.querry(specification).get(0));
    }
}
