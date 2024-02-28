package com.teachmeskills.lesson14.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.teachmeskills.lesson14.util.Logger.logEvent;
import static com.teachmeskills.lesson14.validator.Validator.CheckValidData;

/**
 * Class ParserService
 * separates text into lines
 */
public class ParserService {

    public static void parserDoc(String pathDoc) throws IOException {
        logEvent("Start method parserDoc");

        String[] words = Files.readString(Paths.get(pathDoc)).split("\n");
        logEvent("Split the resulting text into lines");

        for (String w : words) {
            CheckValidData(w);
        }

        logEvent("End method parserDoc");
    }
}
