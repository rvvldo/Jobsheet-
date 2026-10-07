package Pertemuan6;
import java.util.Scanner;

public class operatorLogikaWifi16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiBlokir;

        System.out.print("Apakah pengguna mahasiswa? (True/False): ");
        mahasiswa = aldo.nextBoolean();

        System.out.print("Apakah pengguna dosen? (True/False): ");
        dosen = aldo.nextBoolean();

        System.out.print("Apakah pengguna akun sedang diblokir? (True/False): ");
        akunDiBlokir = aldo.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiBlokir) {
            System.out.println("Akses wifi diberikan");
        } else {
            System.out.println("Akses wifi ditolak");
        }
    }
}
