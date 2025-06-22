/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum15042025;

/**
 *
 * @author User
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat objek
        Hewan hewanumum = new Hewan("Makhluk hiduop");
        Kucing kucingku = new Kucing("Bobby");
        Anjing anjingku = new Anjing("Timy");
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        kucingku.tampilkanNama();
        kucingku.Suara();
        System.out.println();
        anjingku.tampilkanNama();
        anjingku.Suara();
    }
    
}
