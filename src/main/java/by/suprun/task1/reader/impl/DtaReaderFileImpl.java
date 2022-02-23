package by.suprun.task1.reader.impl;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.reader.DataReaderFile;
import by.suprun.task1.validate.StringValidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class DtaReaderFileImpl implements DataReaderFile {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public String dataReaderToFirstValid(String fileName) throws CustomArrayException {
        logger.info("Method dataReaderToFirstValid is start");
        StringValidate stringValidate = new StringValidate();
        String firstValidString = null;
        boolean point = true;
        while (point) {
            try (Scanner scan = new Scanner(new File(fileName))) {
                while (scan.hasNextLine()) {
                    String scanString = scan.nextLine();
                    if (stringValidate.isValid(scanString)) {
                        firstValidString = scanString;
                        point = false;
                    }
                }
            } catch (CustomArrayException e) {
                logger.warn("File not found");
            }
        }

        return firstValidString;
    }

    @Override
    public List<String> readAllFile(String fileName) throws CustomArrayException {
        logger.info("Method dataReaderToFirstValid is start");
        StringValidate stringValidate = new StringValidate();
        List<String> allValidString = null;
        List<String> linesFromFile = Files.readAllLines(Paths.get(fileName));
        for (String l : linesFromFile) {
            if (stringValidate.isValid(l)) {
                allValidString.add(l);
            }
        }
        return allValidString;
    }
}
