package Pertemuan6;
import java.util.Scanner;

public class tugas1DiskonBuku16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        String jenisBuku = aldo.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = aldo.nextInt();

        int diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 9; 
            if (jumlahBuku > 2) { 
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 5;
            if (jumlahBuku > 3) { 
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) { 
                diskon = 3;

            } else {
                diskon = 0;
            }   
        }
        System.out.println("Total Persentase Diskon: " + diskon + "%");
    }
}