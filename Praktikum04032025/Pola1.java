/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum04032025;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Pola1 {
     public static void main(String[] args){
          int M[][],N[][], b, k, i, j,a=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris Matriks : ");
        b = in.nextInt();
        System.out.print("Masukkan Jumlah kolom Matriks : ");
        k = in.nextInt();
       
        
        for(i=0; i<b; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for(i=b; i>0; i--)
        {
            for(j=k; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for(i=0; i<b; i++)
        {
            for(j=0; j<k; j++)
            {
                a++;
                System.out.print(a+"\t");
            }
            System.out.println();
     }
        System.out.println();
        System.out.println();
        for(i=0; i<b; i++)
        {
            for(j=0; j<k; j++)
            {
                a--;
                System.out.print(a+"\t");
            }
            System.out.println();
     }
 }
}
