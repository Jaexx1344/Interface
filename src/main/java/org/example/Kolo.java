package org.example;

public class Kolo extends Figura implements Pole{

    int promien;

    public Kolo(String name, int promien) {
        super(name);
        this.promien = promien;
    }
    final double pi = 3.14;
    @Override
    public double oblicz() {
        return pi*(promien*promien);
    }
}
