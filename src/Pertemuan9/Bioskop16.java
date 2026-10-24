package Pertemuan9;
import java.util.Scanner;

public class Bioskop16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        double hargaTiket = 48000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (Ketik '0' untuk selesai): ");
            int jumlahTiket = aldo.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Transaksi dibatalkan");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket lagi.");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 8) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.09;
            } else {
                diskon += 0;
            }

            double hargaTotal = jumlahTiket * hargaTiket;
            double potongan = hargaTotal * diskon;
            double totalBayar = hargaTotal - potongan;

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Total bayar untuk " + jumlahTiket + " adalah Rp " + totalBayar);
        }

        System.out.println("Rekap penjualan hari ini");
        System.out.println("Total tiket yang terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total harga penjualan hari ini: Rp " + totalPendapatan);
    }
}
