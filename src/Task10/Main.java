package Task10;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println(fileToList("src/Task10/files/lorem_ipsum.txt"));

        //addLineToFile("src/Task10/files/output_file.txt", "Test");

        mergeFiles("src/Task10/files/text1.txt", "src/Task10/files/text2.txt", "src/Task10/files/output_file.txt");

        punctuationToSign("src/Task10/files/output_file.txt");
    }
    public static List<String> fileToList(String path) {
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }

    public static void addLineToFile(String filePath, String text) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(text + "\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mergeFiles(String firstFilePath, String secondFilePath, String outputFilePath) {
        ArrayList<String> firstText = (ArrayList<String>) fileToList(firstFilePath);
        ArrayList<String> secondText = (ArrayList<String>) fileToList(secondFilePath);
        for(String line : firstText) {
            addLineToFile(outputFilePath, line);
        }
        for(String line : secondText) {
            addLineToFile(outputFilePath, line);
        }
    }

    public static void punctuationToSign (String filePath) {
        ArrayList<String> originalText = (ArrayList<String>) fileToList(filePath);
        ArrayList<String> modifiedText = new ArrayList<String>();
        for(String line : originalText) {
            StringBuilder modifiedLine = new StringBuilder();
            char[] myNameChars = line.toCharArray();
            for(char letter : myNameChars) {
                if (!Character.isLetterOrDigit(letter)) {
                    modifiedLine.append("$");
                } else {
                    modifiedLine.append(letter);
                }
            }
            modifiedText.add(modifiedLine.toString());
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(String line : modifiedText) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


