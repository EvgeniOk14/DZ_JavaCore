package org.example.App.logic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NoteWriter
{
    public static void writeToFile(String note)
    {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/notes.txt");
        File file = new File(pathFile);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file.getAbsolutePath(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            writer.write(note.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

