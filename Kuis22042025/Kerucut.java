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
public class Kerucut extends Lingkaran {
    private double tinggi;

    public Kerucut() {
        super(); 

    }

    public Kerucut(double r, double t) {
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
        double r = super.getR(); 
        return (1.0/3) * Math.PI * r * r * tinggi;
    }

    @Override
    public double getLuas() {
        double r = getR();
        double s = getTinggi(); 
        return Math.PI * r * (r + s);
    }

    @Override
    public String toString() {
        return "Kerucut dengan jari-jari: " + getR() + "\ndan tinggi: " + tinggi + "\nLuas Kerucut: " + getLuas() + "\nVolume Krucut: " + getVolume();
    }
}


    

