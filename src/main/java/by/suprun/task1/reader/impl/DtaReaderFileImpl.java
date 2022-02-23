package by.suprun.task1.reader.impl;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.reader.DataReaderFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DtaReaderFileImpl implements DataReaderFile {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] dataReaderArray(String name) throws CustomArrayException {
        logger.info("Method readFile called");

        return new int[0];
    }
}
