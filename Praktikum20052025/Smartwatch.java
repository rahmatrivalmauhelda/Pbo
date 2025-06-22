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
 public class Smartwatch extends Elektronik {
    private int ukuranLayar;
    private boolean tahanAir;

    public Smartwatch() {

    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    public void display() {
        // Menampilkan atribut dari class Elektronik
        System.out.println("Merek: " + getMerek());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Garansi: " + getGaransi() + " tahun");

        // Menampilkan atribut khusus Smartwatch
        System.out.println("Ukuran Layar: " + ukuranLayar + " mm");
        System.out.println("Tahan Air: " + (tahanAir ? "Ya" : "Tidak"));
    }
}

    

