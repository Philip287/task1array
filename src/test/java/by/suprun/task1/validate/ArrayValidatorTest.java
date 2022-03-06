package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    ArrayValidator validator = ArrayValidator.getInstance();

    @Test(expectedExceptions = NullPointerException.class)
    public void validateToEmptyTest() throws CustomArrayException {
        CustomArray customArrayTestNull = new CustomArray();
        validator.validateToEmpty(customArrayTestNull);
    }


}
