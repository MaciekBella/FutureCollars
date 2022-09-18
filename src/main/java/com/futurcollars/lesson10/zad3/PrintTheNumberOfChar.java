package com.futurcollars.lesson10.zad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintTheNumberOfChar {

    public void getWriteTheNumberOdChar() {
        int numberChar;
        try {
            Path path = Paths.get("src/main/resources/com/futurecollars/lesson10/zad0/data.txt");
            String content = Files.readString(path);
            numberChar = content.length();
            System.out.println(numberChar);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
