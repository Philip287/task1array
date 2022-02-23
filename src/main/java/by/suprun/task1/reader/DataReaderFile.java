package by.suprun.task1.reader;

import by.suprun.task1.exception.CustomArrayException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DataReaderFile {
    String dataReaderToFirstValid(String fileName) throws CustomArrayException, FileNotFoundException;

    List<String> readAllFile(String fileName) throws CustomArrayException, IOException;
}
