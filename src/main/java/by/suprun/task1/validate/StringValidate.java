package by.suprun.task1.validate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StringValidate {
    private static final Logger logger = LogManager.getLogger();
    private static final String ARRAY_REGEX = "\\s*-?\\d+(\\s*,\\s*-?\\d+)*\\s*";

    public boolean isValid(String stringTest) {
        logger.info("Method string validate is called");
        return stringTest != null && (stringTest.isBlank() || stringTest.matches(ARRAY_REGEX));

    }
}
