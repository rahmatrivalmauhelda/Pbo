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
public class Kendaraan {
    String jenis;
    String merek;
    int tahun;
    String warna;
    
    //countractor
    public Kendaraan(String j, String m, int t, String w){
     this.jenis=j;
     this.merek=m;
     this.tahun=t;
     this.warna=w;
    }
    //method
    public void InfoKendaraan(){
        System.out.println("Jenis kendaraan = "+jenis);
        System.out.println("Merek kendaraan = "+merek);
        System.out.println("Tahun kendaraan = "+tahun);
        System.out.println("Warna kendaraan = "+warna);
    }
    //method dengan parameter
    public void CekHaraga(int harga){
        System.out.println("Harga Sewa kendaraan Rp "+harga);
    }
    public void  Kecepatan(int kecepatan){
        if( kecepatan>=0  && kecepatan<=40){
            System.out.println("Kendaraan Anda Slow");
        }
        else if (kecepatan>=41 && kecepatan<=60){
            System.out.println("Kendaraan Anda Medium");
        
        }
         else if (kecepatan<=61 && kecepatan<=85){
            System.out.println("Kendaraan Anda fast");
        
        }
         else{
            System.out.println("Kendaraan Anda racing");
        
        }
  
    }
}
