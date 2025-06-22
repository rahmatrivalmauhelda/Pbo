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
public class Pesawat extends Udara{
    private int muatan;
    
    public Pesawat(String nama,int tahunProduksi, boolean mesin,int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;
    }
    public int getMuatan(){
        return muatan;
    }
    
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    public void reset(String nama,int tahunProduksi,boolean mesin){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori (int muatan){
        if(muatan<=50)
            return "muatan kecil";
        else if(muatan<=150)
            return"muatan sedang";
        else
            return"Muatan besar";
    }
    public void cetak(){
        super.cetak();
        System.out.println("Muatan"+muatan+"Penumpang");
        System.out.println("Kategori pesawat"+kategori(muatan));
    }
}
