package com.futurcollars.lesson10.zad6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertToUpperCase {

    public void readString() {
        try {
            Path path = Paths.get("src/main/resources/com/futurecollars/lesson10/zad0/data.txt");
            String content = Files.readString(path);
            String upperCaseContent = content.toUpperCase();
            Files.writeString(Path.of("src/main/resources/com/futurecollars/lesson10/zad6/output.txt"), upperCaseContent);
            System.out.println(upperCaseContent);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
