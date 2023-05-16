package org.example;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat("Kwadrat" ,2);
        Trojkat trojkat = new Trojkat("Trójkąt" ,6, 3);
        Kolo kolo = new Kolo("Koło", 5);

        printPole(kolo);
        printPole(kwadrat);
        printPole(trojkat);
        }
    public static void printPole(Pole pole){
        System.out.println(pole.oblicz());
    }
}