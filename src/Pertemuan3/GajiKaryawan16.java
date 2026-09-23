package Pertemuan3;
import java.util.Scanner;

public class GajiKaryawan16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int gajiPokok;
        double bonus;
        double totalGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan gaji pokok: ");
        gajiPokok = aldo.nextInt();

        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totalGaji);
    }
}
