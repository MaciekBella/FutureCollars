package com.futurcollars.lesson10.zad0;

import java.io.*;

public class CreateAFile {
    public static void main(String[] args) {
        File file = new File("src/main/resources/com/futurecollars/lesson10/zad01/data.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Kurs");
            bufferedWriter.newLine();
            bufferedWriter.write("Java");
            bufferedWriter.newLine();
            bufferedWriter.write("Lekcja 6");
            bufferedWriter.newLine();
            bufferedWriter.write("Pliki");
            bufferedWriter.newLine();
            bufferedWriter.write("Wyjątki");
            bufferedWriter.newLine();
            bufferedWriter.write("Pliki");
            bufferedWriter.newLine();
            bufferedWriter.write("Koniec pliku");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
