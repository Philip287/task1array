package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArrayFindService {
    int arrayMin(CustomArray customArray) throws CustomArrayException;
    int arrayMax(CustomArray customArray) throws CustomArrayException;
    int countNegativeNumbersInArray(CustomArray customArray) throws CustomArrayException;
    int countPositiveNumbersInArray(CustomArray customArray) throws CustomArrayException;
}
