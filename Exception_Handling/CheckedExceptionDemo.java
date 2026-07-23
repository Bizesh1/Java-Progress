package Exception_Handling;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("my_secrets.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, please check path: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred, something went wrong while closing the file: " + e.getMessage());
        } 

        System.out.println("\nException handling completed, program continues to run.");
    }
}


