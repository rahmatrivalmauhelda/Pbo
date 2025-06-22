/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis22042025;

/**
 *
 * @author User
 */
public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder() {
        super();
    }

    public Silinder(double r, double t) {
        super(r);
        this.tinggi = t;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        double r = getR();
        double h = getTinggi();
        return getLuas() * r * r * h;
    }

    @Override
    public double getLuas() {
        double r = getR();
        double h = getTinggi();
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    public String toString() {
        return "Silinder dengan jari-jari: " + getR() + "\n tinggi Selinder: " + tinggi+ "\nLuas Selinder: " + getLuas() + "\nVolume Krucut: " + getVolume();
    }
    
}

    

