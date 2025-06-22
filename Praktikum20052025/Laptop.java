/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20052025;

/**
 *
 * @author User
 */
public class Laptop extends Elektronik {

    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop() {
        // Default constructor
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }

    public void display() {
        // Menampilkan atribut dari class Elektronik
        System.out.println("Merek: " + getMerek());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Garansi: " + getGaransi() + " tahun");

        // Menampilkan atribut khusus Laptop
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas RAM: " + kapasitasRAM + " GB");
    }
}

    

