package Pertemuan3;
import java.util.Scanner;

public class MenghitungCicilan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPokok, uangMuka, lamaCicil, sisaHarga;
        double presentaseBungaPerbulan = 0.02, cicilanPerbulan, bungaPerbulan;

        System.out.print("Masukkan harga pokok: ");
        hargaPokok = sc.nextInt();

        System.out.print("Masukkan uang muka: ");
        uangMuka = sc.nextInt();

        System.out.print("Masukkan lama cicilan: ");
        lamaCicil = sc.nextInt();

        sisaHarga = hargaPokok - uangMuka;
        bungaPerbulan = sisaHarga * presentaseBungaPerbulan;
        cicilanPerbulan = (sisaHarga/lamaCicil) + bungaPerbulan;

        System.out.println("Cicilan perbulan kamu adalah " + (int) cicilanPerbulan);

        sc.close();
    }
}
