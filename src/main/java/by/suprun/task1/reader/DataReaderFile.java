package by.suprun.task1.reader;

import by.suprun.task1.exception.CustomArrayException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DataReaderFile {
    public String dataReaderToFirstValid(String fileName) throws CustomArrayException;

    List<String> readAllFile(String fileName) throws CustomArrayException;
}
