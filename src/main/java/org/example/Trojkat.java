package org.example;

public class Trojkat extends Figura implements Pole{

    private double podstawa;
    private double wysokosc;

    public Trojkat(String name, double podstawa, double wysokosc) {
        super(name);
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public double oblicz() {
       return (podstawa*wysokosc)/2;
    }
}
