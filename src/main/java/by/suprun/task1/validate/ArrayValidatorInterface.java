package by.suprun.task1.validate;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArrayValidatorInterface {

    boolean validateToNull(CustomArray array);

    void validateToEmpty(CustomArray array) throws CustomArrayException;
}
