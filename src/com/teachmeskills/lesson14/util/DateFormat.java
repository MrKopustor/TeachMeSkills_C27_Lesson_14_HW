package com.teachmeskills.lesson14.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class DateFormat
 * building new date parameters
 */
public class DateFormat {

    public static String dateFormat(Date date) {
        SimpleDateFormat newDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
        return newDate.format(date);
    }
}
