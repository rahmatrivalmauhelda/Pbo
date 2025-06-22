/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis22042025;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Mainkuis {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilih;
        double r, t;

        System.out.println("=== MENU ===");
        System.out.println("1. Lingkaran (Bangun Datar)");
        System.out.println("2. Kerucut (Bangun Ruang)");
        System.out.println("3. Silinder (Bangun Ruang)");
        System.out.print("Silahkan pilih bangun (1-3): ");
        pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextDouble();
           
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
                break;

            case 2:
                System.out.print("Masukkan jari-jari kerucut: ");
                r = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                t = scanner.nextDouble();
                Kerucut kerucut = new Kerucut(r, t);
                System.out.println("Volume Kerucut: " + kerucut.getVolume());
                System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuas());
                break;

            case 3:
                System.out.print("Masukkan jari-jari silinder: ");
                r = scanner.nextDouble();
                System.out.print("Masukkan tinggi silinder: ");
                t = scanner.nextDouble();
                Silinder silinder = new Silinder(r, t);
                System.out.println("Volume Silinder: " + silinder.getVolume());
                System.out.println("Luas Permukaan Silinder: " + silinder.getLuas());
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

        
         

