package Pertemuan3;
import java.util.Scanner;

public class MenghitungTotalBayar16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);
        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga: ");
        harga = aldo.nextInt();

        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        
        System.out.println("Jumlah yang harus anda bayar adalah " + jml_bayar);

    }
}