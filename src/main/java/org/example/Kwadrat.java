package org.example;

public class Kwadrat extends Figura implements Pole{

    int bok;

    public Kwadrat(String name, int bok) {
        super(name);
        this.bok = bok;
    }

    @Override
    public double oblicz() {
        return bok*bok;
    }
}
