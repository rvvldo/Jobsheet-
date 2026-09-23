package Pertemuan2;
import java.util.Scanner;

public class Tugas_2_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lebar_tanah, panjang_tanah, diameter_kolam, sisi_taman;
        double phi = 3.14;
        System.out.print("Masukkan lebar tanah (m): ");
        lebar_tanah = input.nextInt();
        System.out.print("Masukkan panjang tanah (m): ");
        panjang_tanah = input.nextInt();
        System.out.print("Masukkan diameter kolam (m): ");
        diameter_kolam = input.nextInt();
        System.out.print("Masukkan sisi taman (m): ");
        sisi_taman = input.nextInt();

        int luas_tanah = panjang_tanah * lebar_tanah;
        double jari_kolam = diameter_kolam / 2.0 ;
        double luas_kolam = phi * jari_kolam * jari_kolam;
        int luas_taman = sisi_taman * sisi_taman;
        double luas_tanah_tidak_digunakan = luas_tanah - luas_kolam - luas_taman;

        System.out.println("Luas tanah yang tidak digunakan adalah " + luas_tanah_tidak_digunakan + " m");
        input.close();
    }
}
