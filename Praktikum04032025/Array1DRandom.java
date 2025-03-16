/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum04032025;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */

public class Array1DRandom {
    public static void main(String[] args)
    {
        int A[],n,i,jumlah = 0,banyak = 0,jumlahg = 0,banyakg = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print(" Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n];//Aukuran n
        System.out.println("===Data Anda===");
        for(i=0;i<n;i++)
        {
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println();
        
         System.out.println("Data Anda Yang Genap : ");
         for(i=0;i<n;i++)
         {
             if(A[i]%2==0)
             {
                 System.out.print(A[i]+"\t");
                 banyak+= 1;
                 jumlah = jumlah + A[i];
             }
             
         }
          System.out.println();
          System.out.println("Data Anda Yang Ganjil : ");
         for(i=0;i<n;i++)
         {
             if(A[i]%2==1)
             {
                 System.out.print(A[i]+"\t");
                 banyakg+= 1;
                 jumlahg = jumlah + A[i];
             }
             
         }
         System.out.println();
         System.out.println("Banyak Data Genap Anda = "+banyak);
         System.out.println("Jumlah Data Genap Anda = "+jumlah);
         System.out.println();
         System.out.println("Banyak Data Ganjil Anda = "+banyakg);
         System.out.println("Jumlah Data Ganjil Anda = "+jumlahg);
         
    }
   
    
}
