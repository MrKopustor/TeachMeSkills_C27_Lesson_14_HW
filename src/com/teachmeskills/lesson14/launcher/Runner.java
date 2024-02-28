package com.teachmeskills.lesson14.launcher;

import java.io.IOException;

import static com.teachmeskills.lesson14.util.Logger.logEvent;
import static com.teachmeskills.lesson14.service.ParserService.parserDoc;

/**
 * Class Runner
 * Takes the path to the document
 * Calls method parserDoc
 */
public class Runner {
    public static void main(String[] args) {
        logEvent("Start");

        String pathDocNum = "C:\\Users\\user\\Desktop\\Java\\C27-onl\\Project\\TeachMeSkills_C27_Lesson_14_HW\\resources\\doc_num";
        logEvent("Received Path from Console");

        try {
            parserDoc(pathDocNum);
        } catch (IOException e) {
            System.out.println("Error while working with a file");
        } catch (Exception e) {
            System.out.println("Error, it will be resolved shortly");
        }

        logEvent("End\n");

    }
}
