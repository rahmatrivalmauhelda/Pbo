/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025;

/**
 *
 * @author user
 */
public class mobil extends kendaraan {
    private int jumlahPintu;
    private String transmisi;
    
    public mobil(String merk, int tahun, int jumlahPintu, String transmisi){
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getTransmisi(){
        return transmisi;
    }
    
    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("Mobil " + merk + "dinyalakan dengan kunci");
    }
    
    @Override
    public void matikan(){
        System.out.println("Mobil " + merk + " dimatikan.");
    }

    @Override
    public void info() {
       System.out.println("Mobil " + merk + ", Tahun" + tahun + ", " +
               jumlahPintu + " Pintu, Transmisi: " + transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa ole, rem dan tekanan ban mobil " + merk + ".");
    }

    @Override
    public void servis() {
       System.out.println("Mobil " + merk + " dijadwalkan servis setiap 10.000 km.");
    }
    
}

