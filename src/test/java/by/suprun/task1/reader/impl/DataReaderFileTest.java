package by.suprun.task1.reader.impl;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.reader.DataReaderFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataReaderFileTest {
    DataReaderFileImpl dataReaderFileImpl = new DataReaderFileImpl();

    @Test(expectedExceptions = CustomArrayException.class)
    public void dataReaderToFirstValidTestException() throws CustomArrayException {
        String actual = dataReaderFileImpl.dataReaderToFirstValid("data.txt");
    }

    @Test
    public void dataReaderToFirstValidTest() throws CustomArrayException {
        String actual = dataReaderFileImpl.dataReaderToFirstValid("/datafile/data.txt");
        String expected = "14 45 55 76 88";
        assertEquals(actual, expected);
    }


    @Test
    public void readAllFile(){


    }

}
