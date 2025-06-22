/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18032025;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TextVehicleEnkapsulasi {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kendaraan 1. Beban maksimal 10.000 kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        //menambahkan beban
        System.out.println("Menambahkan beban 1(500 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2(250 kg)"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3(5000 kg)"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4(4000 kg)"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5(350 kg)"+kendaraan1.addLoad(350));
        
        //menampilkan beban saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+" kg");
        
        //membuat objek kendaraan 2 menggunakan konstruktor kosong
          Scanner in = new Scanner (System.in);
        System.out.println("Kendaraan 2.Beban maksimal belum ada.");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        //set maxLoad menggunakan method setMaxLoad
        System.out.print("Masukkan beban maksimal kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
         //isi beban pada kendaraan
       System.out.print("Masukkan berat beban yang akan diletakkan: ");
       double beban = in.nextDouble();
       while(kendaraan2.addLoad(beban)){
            System.out.println("Beban ditambahkan "+ beban + " kg");
            System.out.print("Masukan berat beban yang akan diletakkan di kendaraan2:");
            beban = in.nextDouble();
        }
        
        if(!kendaraan2.addLoad(beban)){ //not true ===> false
            System.out.println("Beban kendaraan saat ini : "+ kendaraan2.getLoad()+" kg");
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan!");
        }else
            System.out.println("Beban kendaraan saat ini : "+ kendaraan2.getLoad()+" kg");
        
        //menampilkan beban kendaraan2 
        System.out.println("Beban kendaraan2 saat ini: "+ kendaraan2.getLoad()+" kg");
       
      
      
    }
    
}
