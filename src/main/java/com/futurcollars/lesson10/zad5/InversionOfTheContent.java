package com.futurcollars.lesson10.zad5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InversionOfTheContent {

    public void getInversionOfTheContent() {
        try {
            Path path = Paths.get("src/main/resources/com/futurecollars/lesson10/zad0/data.txt");
            List<String> content = Files.readAllLines(path);
            for (int i = content.size() - 1; i > 0; i--) {
                String inversionContent = content.get(i);
                System.out.println(inversionContent);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
