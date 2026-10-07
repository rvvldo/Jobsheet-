package Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = aldo.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = aldo.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = aldo.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 7 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 7 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbinganP1 kurang dari 7 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 7) {
                pesan = "Gagal! LOG bimbingan P1 belum mencapai 7 kali";
            } else {
                pesan = "Gagal! Mahasiswa bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        
        System.out.println(pesan);
    }
}   