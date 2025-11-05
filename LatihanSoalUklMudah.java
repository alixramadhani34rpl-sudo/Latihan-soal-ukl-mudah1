package BuAull;

import java.util.Scanner;

public class LatihanSoalUklMudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak tempuh (km): ");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat barang (kg): ");
        int berat = input.nextInt();
        System.out.println("Masukkan panjang barang (cm): ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar barang (cm): ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi barang (cm): ");
        int tinggi = input.nextInt();
        int volume = panjang * lebar * tinggi;

        
        int hasil = 0;
        if (jarak < 10 || jarak == 10) {
            hasil += 4250 * berat;
        }
        else if(jarak > 10) {
            hasil += 6000 * berat;
        }

        if (volume > 100) {
            hasil += 50000;
        }

        System.out.println("Total ongkos kirim: Rp " + hasil);
    }
}

