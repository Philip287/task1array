package by.suprun.task1.reader.impl;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.reader.DataReaderFile;
import by.suprun.task1.validate.CustomArrayValidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class DtaReaderFileImpl implements DataReaderFile {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public String dataReaderToFirstValid(String fileName) throws CustomArrayException {
        logger.info("Method dataReaderToFirstValid is start");
        checkFile(fileName);
        String firstCorrectLine= null;
        String nextLineFromFile;
        boolean notFoundLine = true;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready() || notFoundLine) {
                nextLineFromFile = testingStringValid(bufferedReader);
                if (nextLineFromFile != null) {
                    firstCorrectLine = nextLineFromFile;
                    notFoundLine = false;
                }
            }
        } catch (IOException exception) {
            logger.error("Exception", exception);
            throw new CustomArrayException(exception);
        }
        return firstCorrectLine;
    }

    @Override
    public List<String> readAllFile(String fileName) throws CustomArrayException {
        logger.info("Method readAllFile is start");
        checkFile(fileName);
        List<String> lines = new ArrayList<>();
        String nextLineFromFile;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready()) {
                nextLineFromFile = testingStringValid(bufferedReader);
                if (nextLineFromFile != null) {
                    lines.add(nextLineFromFile);
                }
            }
        } catch (IOException exception) {
            logger.error("Exception", exception);
            throw new CustomArrayException(exception);
        }
        return lines;
    }

    private void checkFile(String fileName) throws CustomArrayException {
        logger.info("Method checkFile is called.");
        if (fileName == null || fileName.isBlank()) {
            logger.error("checkFile is null or empty string");
            throw new CustomArrayException("Incorrect file name");
        }
        if (Files.notExists(Paths.get(fileName))) {
            logger.error("This file is not exist");
            throw new CustomArrayException("File with name '" + fileName + "' does not exist");
        }
        if (!Files.isReadable(Paths.get(fileName))) {
            logger.error("I can't read this file");
            throw new CustomArrayException("File with name '" + fileName + "' is not readable");
        }
    }

    private String testingStringValid(BufferedReader bufferedReader) throws CustomArrayException {
        logger.info("Method dataReaderToFirstValid is start");
        String currentLine;
        try {
            while (bufferedReader.ready()) {
                currentLine = bufferedReader.readLine();
                CustomArrayValidate validator = new CustomArrayValidate();
                if (validator.isArrayLineIsValid(currentLine)) {
                    return currentLine;
                }
            }
        } catch (IOException exception) {
            logger.error("Exception when use BufferedReader object", exception);
            throw new CustomArrayException(exception);
        }
        return null;
    }
}