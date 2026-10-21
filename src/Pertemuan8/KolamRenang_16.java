//Absen = 16
package Pertemuan8;
import java.util.Scanner;

public class KolamRenang_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        double hargaTiket = 0;
        double diskon = 0;
        int batasDiskon = 19;
        int banyakTiketHargaPenuh = 9;

        System.out.print("Masukkan kode: ");
        int kode = aldo.nextInt();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = aldo.nextInt();

        System.out.print("Masukkan status rombongan sekolah (True/False): ");
        boolean statusRombongan = aldo.nextBoolean();

        if (jumlahTiket <= banyakTiketHargaPenuh) {
            switch (kode) {
            case 1:
                if (jumlahTiket <= 30) {
                hargaTiket = 15000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            case 2:
                if (jumlahTiket <= 30) {
                hargaTiket = 25000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            case 3:
                if (jumlahTiket <= 30) {
                hargaTiket = 15000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            default:
                System.out.println("Kode tidak dikenal");
        }
        } else {
            switch (kode) {
            case 1:
                if (jumlahTiket <= 30) {
                hargaTiket = 13000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            case 2:
                if (jumlahTiket <= 30) {
                hargaTiket = 23000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            case 3:
                if (jumlahTiket <= 30) {
                hargaTiket = 13000;
                if(statusRombongan || batasDiskon >= 19) {
                    diskon = 0.15 * hargaTiket;
                } else {
                    System.out.println("Input tidak valid");
                }
             }
                break;
            default:
                System.out.println("Kode tidak dikenal");
                
        }
    }

    double totalBayar = jumlahTiket * (hargaTiket - diskon);

    System.out.println("Tiket");
    System.out.println("Biaya dasar:" + hargaTiket);
    System.out.println("Diskon: " + diskon);
    System.out.println("Harga tiket: " + totalBayar );
}
}

// Masukkan kode: 1
// Masukkan jumlah tiket: 12
// Masukkan status rombongan sekolah (True/False): true
// Tiket
// Biaya dasar:13000.0
// Diskon: 1950.0
// Harga tiket: 11050.0
// PS C:\Users\WINDOWS 11\PrakDasPro_> 