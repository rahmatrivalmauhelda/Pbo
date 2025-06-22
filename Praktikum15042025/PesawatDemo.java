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
public class PesawatDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pesawat p = new Pesawat("Lion Air",2010,true,120);
        p.cetak();
        
        System.out.println("Stelah Reset");
        p.reset("Airbus",2020, true);
        p.cetak();
    }
    
}
