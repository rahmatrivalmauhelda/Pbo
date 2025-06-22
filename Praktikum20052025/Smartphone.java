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
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }

    public void display() {
        // Menampilkan data dari class Elektronik
        System.out.println("Merek: " + getMerek());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Garansi: " + getGaransi() + " tahun");

        // Menampilkan data khusus Smartphone
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
        System.out.println("Jumlah Kamera: " + jumlahKamera);
    }
}

    

