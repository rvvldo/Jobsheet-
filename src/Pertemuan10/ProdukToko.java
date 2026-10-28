package Pertemuan10;
import java.util.Scanner;

public class ProdukToko {
    public static void main(String[] args) {
    Scanner aldo = new Scanner(System.in);

    int jumlahTerjual;
    int jumlahProduk = 3;
    int jumlahHari = 4;
    int totalPerProduk = 0;
    int totalSeluruh = 0;

    for(int i = 0; i < jumlahHari; i++) {
        for (int j = 0; j < jumlahProduk; j++) {
            System.out.print("Masukkan jumlah terjual produk " + (j+1) + " hari " + (i+1) + " :");
            jumlahTerjual = aldo.nextInt();

            aldo.nextLine();

            totalPerProduk += jumlahTerjual;
        }

        System.out.print("Total penjualan produk pada hari " + (i+1) + ": " + totalPerProduk);
        
        aldo.nextLine();
        
        totalSeluruh += totalPerProduk;
        totalPerProduk = 0;
    }

    System.out.print("Total seluruh penjualan produk: " + totalSeluruh);
    }

}
