package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArrayCalculateService {
    int sumElementsOfArray(CustomArray customArray) throws CustomArrayException;
    double averageOfArray(CustomArray customArray) throws CustomArrayException;
}
