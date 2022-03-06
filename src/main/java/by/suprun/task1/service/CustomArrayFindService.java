package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

import java.util.OptionalInt;

public interface CustomArrayFindService {
    OptionalInt arrayMin(CustomArray customArray) throws CustomArrayException;
    OptionalInt arrayMax(CustomArray customArray) throws CustomArrayException;
    int countNegativeNumbersInArray(CustomArray customArray) throws CustomArrayException;
    int countPositiveNumbersInArray(CustomArray customArray) throws CustomArrayException;
}
