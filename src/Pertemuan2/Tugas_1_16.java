package Pertemuan2;
import java.util.Scanner;

public class Tugas_1_16 {
    public static void main(String[] args) {
        int total_tunjangan_anak;
        double potongan_pensiun, gaji_bersih;
        double presentase_potongan_pensiun = 0.1;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok anda: ");
        int gaji_pokok = input.nextInt();

        System.out.print("Masukkan jumlah anak anda: ");
        int jumlah_anak = input.nextInt();

        System.out.print("Masukkan tunjangan anak perbulan: ");
        int tunjangan_peranak_perbulan = input.nextInt();

        total_tunjangan_anak = jumlah_anak * tunjangan_peranak_perbulan;
        potongan_pensiun = gaji_pokok * presentase_potongan_pensiun;
        gaji_bersih = (gaji_pokok + total_tunjangan_anak) - potongan_pensiun;

        System.out.println("Total tunjangan anak/bulan anda adalah Rp " + total_tunjangan_anak);
        System.out.println("Total potongan pensiun anda adalah Rp " + potongan_pensiun);
        System.out.println("Total gaji bersih anda adalah Rp " + gaji_bersih);
        input.close();
    }
}
