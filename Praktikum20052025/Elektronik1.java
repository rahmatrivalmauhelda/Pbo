package Praktikum20052025;

public class Elektronik1 {
    public static void main(String[] args) {
        // Laptop
        Laptop laptop = new Laptop();
        laptop.setMerek("ROG M1");
        laptop.setTahunProduksi(2022);
        laptop.setGaransi(2);
        laptop.setUkuranLayar(15);
        laptop.setKapasitasRAM(16);

        System.out.println("======= Laptop =======");
        laptop.display();

        // Smartphone
        Smartphone hp = new Smartphone();
        hp.setMerek("Samsung");
        hp.setTahunProduksi(2023);
        hp.setGaransi(1);
        hp.setKapasitasBaterai(5000);
        hp.setJumlahKamera(4);

        System.out.println("\n=== Smartphone ===");
        hp.display();

        // Gaming Laptop
        Gaming gamingLaptop = new Gaming();
        gamingLaptop.setMerek("MSI");
        gamingLaptop.setTahunProduksi(2024);
        gamingLaptop.setGaransi(3);
        gamingLaptop.setUkuranLayar(17);
        gamingLaptop.setKapasitasRAM(32);
        gamingLaptop.setKartuGrafis("NVIDIA RTX 4080");
        gamingLaptop.setRefreshRate(165);

        System.out.println("\n=== Gaming Laptop ===");
        gamingLaptop.display();

        // Smartwatch
        Smartwatch sw = new Smartwatch();
        sw.setMerek("Apple");
        sw.setTahunProduksi(2023);
        sw.setGaransi(1);
        sw.setUkuranLayar(2);
        sw.setTahanAir(true);

        System.out.println("\n=== Smartwatch ===");
        sw.display();
    }
}
