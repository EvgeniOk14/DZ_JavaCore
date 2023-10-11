package org.example.App.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil
{
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static String getCurrentDate()
    {
        LocalDate currentDate = LocalDate.now();
        return currentDate.format(DATE_FORMATTER);
    }
}
