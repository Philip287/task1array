package by.suprun.task1.parser;

import by.suprun.task1.exception.CustomArrayException;

import java.util.List;

public interface CustomArrayParser {
    int[] parseScanLine(String line) throws CustomArrayException;

    List<int[]> parseListString(List<String> lines) throws CustomArrayException;
}
