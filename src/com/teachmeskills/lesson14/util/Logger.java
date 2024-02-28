package com.teachmeskills.lesson14.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

import static com.teachmeskills.lesson14.constants.Constants.PATH_ERROR_LOG;
import static com.teachmeskills.lesson14.constants.Constants.PATH_EVENT_LOG;
import static com.teachmeskills.lesson14.util.DateFormat.dateFormat;

/**
 * Class Logger
 * It has 2 methods that call error and event logs
 */
public class Logger {

    public static void logEvent(String message) {

        String log = dateFormat(new Date()) + " -> " + message;
        try {
            Files.write(Paths.get(PATH_EVENT_LOG), (log + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // do nothing
        }
    }

    public static void logError(String message) {

        String log = dateFormat(new Date()) + " -> " + message;
        try {
            Files.write(Paths.get(PATH_ERROR_LOG), (log + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // do nothing
        }
    }
}
