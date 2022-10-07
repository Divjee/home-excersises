package io.codelex.collections.practice;

import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Salix\\Documents\\home-excersises\\home-excersises\\Java homework\\src\\resources\\collections\\lear.txt"));

        String currentLine = read.readLine();
        while (currentLine != null) {
            lineCount++;


            wordCount += currentLine.split("\\s+").length;
            String[] currentLineArr = currentLine.split("");

            charCount = charCount + currentLineArr.length;

            currentLine = read.readLine();


        }
        System.out.println(" Total words: " + wordCount + "\nTotal Characters: " + charCount + "\n Total lines: " + lineCount);
    }

}
