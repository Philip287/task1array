package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

import java.util.OptionalDouble;

public interface CustomArrayCalculateService {
    OptionalDouble sumElementsOfArray(CustomArray customArray) throws CustomArrayException;

    OptionalDouble averageOfArray(CustomArray customArray) throws CustomArrayException;

}