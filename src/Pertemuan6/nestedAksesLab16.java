package Pertemuan6;
import java.util.Scanner;

public class nestedAksesLab16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah pengguna mahasiswa aktif? (True/False): ");
        mahasiswaAktif = aldo.nextBoolean();

        System.out.print("Apakah pengguna mahasiswa sedang disanksi? (True/False): ");
        sedangDisanksi = aldo.nextBoolean();

        System.out.print("Apakah pengguna mahasiswa punya izin dosen? (True/False): ");
        punyaIzinDosen = aldo.nextBoolean();

        System.out.print("Apakah pengguna mahasiswa asisten lab? (True/False): ");
        asistenLab = aldo.nextBoolean();

        if(mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikkan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }   
}
