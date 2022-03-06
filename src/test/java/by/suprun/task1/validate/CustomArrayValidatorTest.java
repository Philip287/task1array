package by.suprun.task1.validate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CustomArrayValidatorTest {
    CustomArrayValidate customArrayValidate = CustomArrayValidate.getInstance();

    @Test
    public void validateToEmptyTestGoodString() {
        String testString = "42, 44, 92, 100, 43";
        boolean actual = customArrayValidate.isArrayLineIsValid(testString);
        assertTrue(actual);
    }

    @Test
    public void validateToEmptyTestBadString() {
        String testString = "string";
        boolean actual = customArrayValidate.isArrayLineIsValid(testString);
        assertFalse(actual);
    }

    @Test
    public void validateToEmptyTestNull() {
        boolean actual = customArrayValidate.isArrayLineIsValid(null);
        assertFalse(actual);
    }

}
