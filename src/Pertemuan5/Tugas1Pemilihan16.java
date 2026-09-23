package Pertemuan5;
import java.util.Scanner;

public class Tugas1Pemilihan16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        boolean uktLunas;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = aldo.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi.\nSilahkan cetak KRS dan minta tanda tangan DPA." : "Registrasi ditolak.\nSilahkan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);
    }
}
