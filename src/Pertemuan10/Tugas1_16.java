package Pertemuan10;
import java.util.Scanner;

public class Tugas1_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = aldo.nextInt();

        int angkaTercetak = 0;

        if (n < 1) {
            System.out.println("Jumlah n minimal 1");
        } else {
            for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                angkaTercetak++;
            }
            System.out.println();
        }
        
        System.out.println("Total angka tercetak: " + angkaTercetak);
        }

        
    }
}
