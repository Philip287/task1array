package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {
    private static final Logger logger = LogManager.getLogger(ArrayValidator.class.getName());
    private static ArrayValidator instance;

    private ArrayValidator() {

    }

    public static ArrayValidator getInstance() {
        if (instance == null) {
            return new ArrayValidator();
        }
        return instance;
    }

    public boolean validateToEmpty(CustomArray array) throws CustomArrayException {
        if (array == null || array.getArray().length == 0) {
            logger.error("Array is equal to null or array is empty");
            throw new CustomArrayException("Entity is equal to null or array is empty");
        }
        return true;
    }
}