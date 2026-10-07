package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Apakah pengguna mahasiswa aktif? (True/False): ");
        boolean mahasiswaAktif = aldo.nextBoolean();

        System.out.print("Apakah pengguna sedang disanksi? (True/False): ");
        boolean sedangDisanksi = aldo.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai dasar pemrograman: ");
            double nilaiDaspro = aldo.nextDouble();

            System.out.print("Apakah pengguna memiliki sertifikat kompetensi pemrograman? (True/False): ");
            boolean isSertifikat = aldo.nextBoolean();  

            if (nilaiDaspro >= 80 || isSertifikat) {
                System.out.println("Selamat! Kamu lolos ke tahap wawancara!");

                System.out.print("Masukkan nilai wawancara: ");
                double nilaiWawancara = aldo.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Kamu telah diterima sebagai asisten");
                } else {
                    System.out.println("Gagal! Nilai wawancara mahasiswa tidak memenuhi minimal nilai wawancara 75");
                }
            } else {
                System.out.println("Gagal! Mahasiswa tidak memenuhi minimal nilai dasar pemrograman 80 atau tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Gagal! Mahasiswa tidak memenuhi syarat");
        } 
    }
}
