/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025;

/**
 *
 * @author user
 */
public class mainKendaraan {
    public static void main(String[]args){
        mobil mobil = new mobil("Toyota Avanza", 2022, 4, "Automatic");
        motor motor = new motor("Yamaha NMAX", 2023, "FULL Face", 155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan(); 
    }
}
