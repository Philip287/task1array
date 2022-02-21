package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest extends Assert {
    ArrayValidator arrayValidator = new ArrayValidator();
    private static final Logger logger = LogManager.getLogger(ArrayValidatorTest.class.getName());


    @Test
    public void positiveValidateToNullTest() throws CustomArrayException {
        CustomArray goodTestArray = new CustomArray(2,3,4,5,6);
        arrayValidator.validateToNull(goodTestArray);
        logger.info("PositiveValidateToNullTest() is end");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void negativeValidateToNullTest() throws CustomArrayException {
        CustomArray nullTestArray = new CustomArray();
        arrayValidator.validateToNull(nullTestArray);
        logger.info("NegativeValidateToNullTest( is end");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void positiveValidateToEmptyTest() throws CustomArrayException {
        CustomArray nullTestArray = new CustomArray();
        arrayValidator.validateToEmpty(nullTestArray);
        logger.info("NegativeValidateToNullTest( is end");
    }
}
