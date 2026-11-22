package Pertemuan12;
import java.util.Scanner;

public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = aldo.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = aldo.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = aldo.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1) + " (indeks ke-" + i + ")");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan di dalam daftar nilai.");
        }
    }
}
