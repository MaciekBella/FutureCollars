package com.futurcollars.lesson10.zad2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public void getTheSecondLine() {
        try {
            Path path = Paths.get("src/main/resources/com/futurecollars/lesson10/zad0/data.txt");
            List<String> content = Files.readAllLines(path);
            for (int i = 0; i < content.size(); i = i + 2) {
                System.out.println(content.get(i));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
