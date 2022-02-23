package by.suprun.task1.reader;

import by.suprun.task1.exception.CustomArrayException;

public interface DataReaderFile {
    public int[] dataReaderArray(String name) throws CustomArrayException;
}
