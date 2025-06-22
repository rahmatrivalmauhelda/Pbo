/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025;

/**
 *
 * @author user
 */
public abstract class kendaraan {
    protected String merk;
    protected int tahun;
    
    public kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public void nyalakan(){
        System.out.println("Kendaraan dinyalakan");
    }
    
    public void matikan(){
        System.out.println("Kendaraan dimatikan");
    }
    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
    
}
