/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Nama: Rahmat Rival Mauhelda
//Nim:2401081011

package Praktikum18032025;

/**
 *
 * @author User
 */
public class TestPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("banyak objek saat ini = "+PersegiPanjang.getjumlahobjek());
        //buat objek pertama
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        System.out.println("banyak objek setelah  PP1 = "+PersegiPanjang.getjumlahobjek());
        System.out.println("Luas ="+PP1.panjang+" * "+PP1.lebar+" = "+PP1.getLuas());
        
        //buat objek kedua
        PersegiPanjang PP2 = new PersegiPanjang(15,4);
        System.out.println("banyak objek setelah  PP2 = "+PersegiPanjang.getjumlahobjek());
        System.out.println("Keliling = 2*("+PP2.panjang+" + "+PP2.lebar + ") = "+PP2.getKeliling());
    }
    
}
