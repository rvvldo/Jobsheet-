package Pertemuan9;
import java.util.Scanner;

public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int jumlahMahasiswa = 9;
        int batasKelulusan = 60;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for(int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = aldo.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= batasKelulusan) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }

        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);
    }
}