package Pertemuan10;
import java.util.Scanner;

public class Tugas2_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = aldo.nextInt();
        int jumlahAngka = 0;
        int pengkali = 1;

        if (n < 3) {
            System.out.println("Jumlah n minimal 3");
        } else {
            for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                int nilai = j * pengkali;
                System.out.printf("%4d", nilai);
                jumlahAngka += nilai;
            }

            pengkali++;
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlahAngka);
        }
    }
}
