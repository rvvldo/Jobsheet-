package Pertemuan9;
import java.util.Scanner;

public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = aldo.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }

            System.out.print("Masukkan jumlah kopi: ");
            kopi = aldo.nextInt();

            System.out.print("Masukkan jumlah teh: ");
            teh = aldo.nextInt();

            System.out.print("Masukkan jumlah roti: ");
            roti = aldo.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            aldo.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");
    }
}