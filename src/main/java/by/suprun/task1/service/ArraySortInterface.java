package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArraySortInterface {
    void bubbleSort(CustomArray customArray) throws CustomArrayException;
    void quickSort(CustomArray customArray) throws CustomArrayException;
    void shellSort(CustomArray customArray) throws CustomArrayException;
}
