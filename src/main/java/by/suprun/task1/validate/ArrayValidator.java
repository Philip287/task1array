package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {
    private static final Logger logger = LogManager.getLogger(ArrayValidator.class);

    public boolean validateToNull(CustomArray array){
        return array == null || array.getArray().length == 0;
    }

    public void validateToEmpty(CustomArray array) throws CustomArrayException{
        if (validateToNull(array)){
            logger.error("Array is equal to null or array is empty");
            throw new CustomArrayException("Entity is equal to null or array is empty");
        }
    }
}
