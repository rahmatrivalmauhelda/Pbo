/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Nama: Rahmat Rival Mauhelda
//Nim:2401081011

package Tugas25032025;

/**
 *
 * @author User
 */
public class Tabungan {
   private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo){
        saldo-= jumlah;
        return true;
        }
        return false;
    }
    
    public boolean transfer(Tabungan t, int jumlah){
        if (ambilUang(jumlah)) {
        t.simpanUang(jumlah);
        return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}
