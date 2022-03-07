package by.suprun.task1.validate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayValidate {
    private static final Logger logger = LogManager.getLogger();
    private static final String ARRAY_REGEX = "\\s*(-\\s*)?\\d+(\\s*,\\s*(-\\s*)?\\d+)*\\s*";
    private static CustomArrayValidate instance;

    private CustomArrayValidate() {

    }

    public static CustomArrayValidate getInstance() {
        if (instance == null) {
            return new CustomArrayValidate();
        }
        return instance;
    }

    public boolean isArrayLineIsValid(String stringTest) {
        logger.info("Method string validate is called");
        return stringTest != null && (stringTest.isBlank() || stringTest.matches(ARRAY_REGEX));
    }
}