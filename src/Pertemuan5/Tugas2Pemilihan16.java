package Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan jumlah SKS: ");
        int jumlahSks = aldo.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS Valid");
        }
    }
}
