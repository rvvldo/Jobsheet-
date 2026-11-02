package Pertemuan10;
import java.util.Scanner;

public class Triangle16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = aldo.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.print("[i = " + i + " ]");
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        aldo.close();
    }
}
