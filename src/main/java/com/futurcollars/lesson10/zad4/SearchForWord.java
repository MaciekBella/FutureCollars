package com.futurcollars.lesson10.zad4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchForWord {
    public void getSearchForWord(String text) {
        try {
            Path path = Paths.get("src/main/resources/com/futurecollars/lesson10/zad0/data.txt");
            String content = Files.readString(path);
            boolean isTextInFile = content.contains(text);
            System.out.println(content);
            System.out.println("* * * * * * * *");
            System.out.println(isTextInFile);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}