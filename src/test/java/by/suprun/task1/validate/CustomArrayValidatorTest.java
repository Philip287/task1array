package by.suprun.task1.validate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomArrayValidatorTest {
    private static final Logger logger = LogManager.getLogger();
    CustomArrayValidate customArrayValidate = CustomArrayValidate.getInstance();
    @Test
    public void validateToEmptyTestGoodString() {
        logger.info("Method validateToEmptyTestGoodString is start");
        String testString = "1 3 5 7";
        boolean actual = customArrayValidate.isArrayLineIsValid(testString);
        assertTrue(actual);
    }

    @Test
    public void validateToEmptyTestBadString() {
        logger.info("Method validateToEmptyTestBadString is start");
        String testString = "string";
        boolean actual = customArrayValidate.isArrayLineIsValid(testString);
        assertFalse(actual);
    }

    @Test
    public void validateToEmptyTestNull() {
        logger.info("Method validateToEmptyTestNull is start");
        boolean actual = customArrayValidate.isArrayLineIsValid(null);
        assertFalse(actual);
    }

}
