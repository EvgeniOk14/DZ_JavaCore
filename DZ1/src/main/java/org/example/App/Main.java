package org.example.App;

import org.example.App.logic.NoteWriter;
import org.example.App.util.DateUtil;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        String currentDate = DateUtil.getCurrentDate();
        String formattedNote = String.format("%s -> %s", currentDate, note);

        NoteWriter.writeToFile(formattedNote);
    }
}
