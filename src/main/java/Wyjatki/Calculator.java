package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void divideFromCommandLine(){

        int a,b;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a");
            a = scan.nextInt();
            System.out.println("Enter b");
            b = scan.nextInt();
        System.out.println("Wynik dzielenia a przez b to : " +divide(a,b) );

    }
    public int divide(int a,int b){
            return a/b;
    }
}
