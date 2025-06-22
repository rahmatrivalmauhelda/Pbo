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
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;

    public Gaming() {
        
    }

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void display() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Garansi: " + getGaransi() + " tahun");
        System.out.println("Kartu Grafis: " + kartuGrafis);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
    }
}
   

