package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArraySortService {
    void bubbleSort(CustomArray customArray) throws CustomArrayException;
    void insertionSort(CustomArray customArray) throws CustomArrayException;
    void selectionSort(CustomArray customArray) throws CustomArrayException;
}
