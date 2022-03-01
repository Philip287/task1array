package by.suprun.task1.service.impl;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.service.ArrayChangeService;
import by.suprun.task1.validate.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeImpl implements ArrayChangeService {
    private static final ArrayValidator validator = new ArrayValidator();
    private static final Logger logger = LogManager.getLogger();
    private static ArrayChangeImpl instance;

    private ArrayChangeImpl() {

    }

    public static ArrayChangeImpl getInstance() {
        if (instance == null) {
            return new ArrayChangeImpl();
        }
        return instance;
    }

    @Override
    public void changeElement(CustomArray customArray, int position, int elementToAdd) throws CustomArrayException {
        logger.info("Method changeElements is called");
        validator.validateToEmpty(customArray);
        int[] tempArray = customArray.getArray();
        if (position <= tempArray.length && position >= 0) {
            tempArray[position] = elementToAdd;
            customArray.setArray(tempArray);
        } else {
            logger.error("Incorrect condition");
            throw new CustomArrayException("Incorrect condition");
        }
    }
}
