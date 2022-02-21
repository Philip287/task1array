package by.suprun.task1.service;

import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.exception.CustomArrayException;

public interface ArrayChangeInterface {
    void changeElement(CustomArray customArray, int position, int elementToAdd) throws CustomArrayException;

}
