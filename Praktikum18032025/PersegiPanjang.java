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
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahobjek = 0;
    public PersegiPanjang(){
        jumlahobjek++;
    }
    public PersegiPanjang(int pjbaru,int lbrbaru){
        panjang = pjbaru;
        lebar = lbrbaru;
        jumlahobjek++;
    }
    public static int getjumlahobjek(){
        return jumlahobjek;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}
