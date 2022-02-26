package by.suprun.task1.validate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;


public class CustomArrayValidate {
    private static final Logger logger = LogManager.getLogger();
    private static final String ARRAY_REGEX = "^\\d+([-,\\s]{1}\\d+)*$";

    public boolean isArrayLineIsValid(String stringTest) {
        logger.info("Method string validate is called");
        if (stringTest != null && !stringTest.isEmpty()) {
           return stringTest.matches(ARRAY_REGEX);
        }
        return false;
    }
}

