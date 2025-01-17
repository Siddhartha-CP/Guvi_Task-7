package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
            e.printStackTrace();
        }
    }
}

