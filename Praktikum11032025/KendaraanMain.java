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
import java.util.Scanner;
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String jenis;
        String merek;
        String warna;
        int tahun;
        int harga;
        int kecepatan;
        
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis=in.nextLine();
        System.out.print("Masukkan merek kendaraan = ");
        merek=in.nextLine();
        System.out.print("Masukkan tahun kendaraan = ");
        tahun=in.nextInt();
        in.nextLine();//pembersih line utk string
        System.out.print("Masukkan warna kendaraan = ");
        warna=in.nextLine();
        System.out.print("Masukkan Harga Sewa kendaraan = ");
        harga=in.nextInt();
        System.out.print("Masukkan Kecepatan kendaraan = ");
        kecepatan=in.nextInt();
         System.out.print("--------------------------------");
        //objek baru -- class kendaraan
        Kendaraan kdr=new Kendaraan(jenis,merek,tahun,warna);
       
        kdr.InfoKendaraan();
        kdr.CekHaraga(harga);
        kdr.Kecepatan(kecepatan);
    
    }
    
}
