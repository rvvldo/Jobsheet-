package Pertemuan10;
import java.util.Scanner;

public class Tugas3_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = aldo.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1");
        } else {
            int totalSemua = 0, barangTerbanyak = -1, tokoTerbanyak = 0;
            for(int i = 1; i <= jumlahToko; i++) {
                int pelanggan;

                do {
                    System.out.print("Toko " + i + " - Jumlah Pelanggan: ");
                    pelanggan = aldo.nextInt();
                } while (pelanggan < 0);

                int totalToko = 0;
                for (int j = 1; j <= pelanggan; j++) {
                    int barang;
                    do {
                        System.out.print("Barang pelanggan " + j + " : ");
                        barang = aldo.nextInt();

                    } while (barang < 0);

                    totalToko += barang;
                }

                System.out.println("Toko " + i + " - Pelanggan " + pelanggan + ", total barang: " + totalToko);
                totalSemua += totalToko;

                if (totalSemua > barangTerbanyak) {
                    barangTerbanyak = totalToko;
                    tokoTerbanyak = i;
                }
            }
            
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
    }
}
