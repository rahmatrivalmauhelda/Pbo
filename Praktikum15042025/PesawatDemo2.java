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
public class PesawatDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pesawat[]daftarPesawat=new Pesawat[3];
        
        daftarPesawat[0]=new Pesawat("Lion Air",2015,true,80);
        daftarPesawat[1]=new Pesawat("AIr Asia",2018,true,120);
        daftarPesawat[2]=new Pesawat("Garuda",2020,true,180);
        
        //menampilkan isi array
        for(int i=0;i<daftarPesawat.length;i++){
            System.out.println("Data Pesawat ke"+(i+1)+"adalah");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
    
}
