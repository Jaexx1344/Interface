package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {

    public String readFirstLine(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext() ) {
            stringBuilder.append(scanner.next() + " ");


        }
        return stringBuilder.toString();
    }

    public void createFile(String fileName) throws IOException{
        File file = new File(fileName);

            file.createNewFile();

    }

    public void writeLine(String fileName) throws FileNotFoundException {

        PrintWriter print = new PrintWriter(fileName);
        print.println("Siemka hej \n Co tam");
        print.close();
    }
}
