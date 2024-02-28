package com.teachmeskills.lesson14.validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static com.teachmeskills.lesson14.constants.Constants.*;
import static com.teachmeskills.lesson14.util.Logger.logError;
import static com.teachmeskills.lesson14.util.Logger.logEvent;

/**
 * Class validator
 * checks words with specified constants
 */
public class Validator {

    public static void CheckValidData(String word) {
        logEvent("Start method CheckValidData");

        String CarriageReturn = "\r";
        word = word.replace(CarriageReturn, "");

        if (!(word.length() == DOC_LENGTH)) {
            logError("Error, wrong number of characters");
            try {
                Files.write(Paths.get(PATH_INVALID_DOC), (word + " -> Error, wrong number of characters" + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                logError("Error, conforms to document standard");
            } catch (Exception e) {
                logError("Error, it will be resolved shortly");
            }
        } else if (word.matches(REG_EXP_DOC_NUMBER)) {
            try {
                Files.write(Paths.get(PATH_VALID_DOC), (word + "\n").getBytes(), StandardOpenOption.APPEND);
                logEvent("Valid document is written to a file ");
            } catch (IOException e) {
                logError("Error, conforms to document standard");
            } catch (Exception e) {
                logError("Error, it will be resolved shortly");
            }
        } else if (word.matches(REG_EXP_CONTRACT)) {
            try {
                Files.write(Paths.get(PATH_VALID_CONTRACT), (word + "\n").getBytes(), StandardOpenOption.APPEND);
                logEvent("Valid document is written to a file ");
            } catch (IOException e) {
                logError("Error, complies with contract standard");
            } catch (Exception e) {
                logError("Error, it will be resolved shortly");
            }
        } else {
            logError("Error, complies with contract standard");
            try {
                Files.write(Paths.get(PATH_INVALID_DOC), (word + " -> Error, complies with contract standard" + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                logError("Error, conforms to document standard");
            } catch (Exception e) {
                logError("Error, it will be resolved shortly");
            }
        }

        logEvent("End method CheckValidData");

    }
}