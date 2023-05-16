package Wyjatki;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
//        try {
//            calc.divideFromCommandLine();
//        } catch (InputMismatchException e){
//            System.out.println("Nie wprowadzono liczby");
//
//        } catch (ArithmeticException e) {
//            System.out.println("Nie dziel przez 0");
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Miłego dnia! ");
//        }

        final FileManager fileManager = new FileManager();
        String fileName = "xd.txt";
        fileManager.createFile(fileName);
        fileManager.writeLine(fileName);
        System.out.println(fileManager.readFirstLine(fileName));
    }
}
