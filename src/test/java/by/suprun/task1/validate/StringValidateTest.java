package by.suprun.task1.validate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringValidateTest {
    private static final Logger logger = LogManager.getLogger();
    StringValidate stringValidate = new StringValidate();

    @Test
    public void stringValidateTest(){
        logger.info("Method StringValidateTest os called");
        String testString = "  1; - 2; 3  ";
        boolean actual = stringValidate.isValid(testString);
        assertEquals(actual, true);
    }
}
