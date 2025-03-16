/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11032025;

/**
 *
 * @author User
 */
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //buat class baru
        Mobil mobilku=new Mobil();
        mobilku.merk="toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="HItam";
        System.out.println("------------");
        System.out.println("Data Mobil 1 =");
        System.out.println("merk Mobil  ="+mobilku.merk);
        System.out.println("plat Mobil  ="+mobilku.plat);
        System.out.println("Tahun Mobil  ="+mobilku.tahun);
        System.out.println("Warna Mobil 1 ="+mobilku.warna);
        
        Mobil impian=new Mobil();
        impian.merk="Nissan GTR";
        impian.plat="BA 234 P";
        impian.tahun=2035;
        impian.warna="Biru";
        System.out.println("------------");
        System.out.println("Data Mobil Impian =");
        System.out.println("merk Mobil  ="+impian.merk);
        System.out.println("plat Mobil  ="+impian.plat);
        System.out.println("Tahun Mobil ="+impian.tahun);
        System.out.println("Warna Mobil ="+impian.warna);
        //pemanggilan method
        mobilku.MobilAktif();//tanpa return
        System.out.println(mobilku.suaramobil());//return
    }
    
    
    
}
