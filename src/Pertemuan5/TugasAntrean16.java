package Pertemuan5;
import java.util.Scanner;

public class TugasAntrean16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.println("MENU AKADEMIK");
        System.out.println("1. Legalisir Ijazah - Loket A");
        System.out.println("2. Surat Keterangan Aktif Kuliah - Loket B");
        System.out.println("3. Pembayaran UKT - Loket C");
        System.out.println("4. Pengajuan Cuti Akademik - Loket D");

        System.out.print("Masukkan kode angka: ");
        int kode = aldo.nextInt();

        switch (kode) {
            case 1:
                System.out.println("1. Legalisir Ijazah - Loket A");
                break;
            case 2:
                System.out.println("2. Surat Keterangan Aktif Kuliah - Loket B");
                break;
            case 3:
                System.out.println("3. Pembayaran UKT - Loket C");
                break;
            case 4:
                System.out.println("4. Pengajuan Cuti Akademik - Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}
