package Pertemuan9;
import java.util.Scanner;

public class Parkir16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner (System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenis = aldo.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = aldo.nextInt();

                if (jenis == 1) {
                    total += durasi * 3500;
                } else if (jenis == 2) {
                    total += durasi * 2500;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid. Masukkan 1, 2, atau 0.");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
    }
}
