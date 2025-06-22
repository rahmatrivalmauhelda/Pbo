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
public class Testvehicle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

            //buat vehicle dengan beban maksimal 10000kg
            System.out.println("Kendaraan 1.beban maksimal 10.000kg");
            vehicle kendaraan1 = new vehicle(10000);
            
            //menambahkan beberapa beban(load)
            System.out.println("Menambahkan beban 1 (500 kg)");
            kendaraan1.load = kendaraan1.load + 500;
            System.out.println("Menambahkan beban 2 (250 kg)");
            kendaraan1.load = kendaraan1.load + 250;
            System.out.println("Menambahkan beban 3 (5000 kg)");
            kendaraan1.load = kendaraan1.load + 5000;
            System.out.println("Menambahkan beban 4 (4000 kg)");
            kendaraan1.load = kendaraan1.load + 4000;
            System.out.println("Menambahkan beban 5 (350 kg)");
            kendaraan1.load = kendaraan1.load + 350;
            
            //menampilkan beban 1 (load) kendaraan saat ini
            System.out.println("Beban Kendaraan saat ini = "+kendaraan1.getLoad()+" kg");
        
    }
    
    
}
