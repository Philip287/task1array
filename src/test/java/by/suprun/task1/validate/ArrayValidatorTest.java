package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private static final Logger logger = LogManager.getLogger();
    ArrayValidator validator = new ArrayValidator();

    @Test(expectedExceptions = NullPointerException.class)
    public void validateToEmptyTest() throws CustomArrayException {
        CustomArray customArrayTestNull = new CustomArray(null);
        validator.validateToEmpty(customArrayTestNull);
    }


}
