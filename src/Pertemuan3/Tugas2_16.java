package Pertemuan3;
import java.util.Scanner;

public class Tugas2_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int banyak_lembar;
        int biaya_cetak = 500; 
        int biaya_jilid = 5000; 
        int total_biaya;

        System.out.print("Masukkan berapa banyak lembar: ");
        banyak_lembar = aldo.nextInt();

        total_biaya = (banyak_lembar * biaya_cetak) + biaya_jilid;

        System.out.println("Total biaya nya adalah Rp. " + total_biaya);
    }
}
