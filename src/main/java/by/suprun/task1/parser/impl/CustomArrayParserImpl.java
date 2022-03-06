package by.suprun.task1.parser.impl;

import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.parser.CustomArrayParser;
import by.suprun.task1.validate.CustomArrayValidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class CustomArrayParserImpl implements CustomArrayParser {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] parseScanLine(String line) throws CustomArrayException {
        logger.info("Method parseScanLine start");
        CustomArrayValidate customArrayValidate = CustomArrayValidate.getInstance();
        int[] arrayElements;
        if (customArrayValidate.isArrayLineIsValid(line)) {
            line = line.replaceAll("\\s", "");
            if (!line.isEmpty()) {
                String[] lineParts = line.split(",");
                arrayElements = new int[lineParts.length];
                for (int i = 0; i < arrayElements.length; i++) {
                    arrayElements[i] = Integer.parseInt(lineParts[i]);
                }
            } else {
                arrayElements = new int[0];
            }
        } else {
            logger.error("Incorrect line");
            throw new CustomArrayException("Incorrect line: " + line);
        }
        return arrayElements;
    }

    @Override
    public List<int[]> parseListString(List<String> lines) throws CustomArrayException {
        logger.info("Method parseListString is start");
        CustomArrayValidate customArrayValidate = CustomArrayValidate.getInstance();
        List<int[]> arrays = new ArrayList<>();
        int[] currentArray;
        if (lines == null || lines.isEmpty()) {
            logger.error("Incorrect line list");
            throw new CustomArrayException("Line list is null or empty");
        }
        for (String line : lines) {
            if (customArrayValidate.isArrayLineIsValid(line)) {
                for (String line1 : lines) {
                    currentArray = parseScanLine(line1);
                    arrays.add(currentArray);
                }
            }
        }
        return arrays;
    }
}
