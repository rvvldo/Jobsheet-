package Pertemuan10;    
import java.util.Scanner;

public class Star16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = aldo.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();
        aldo.close();

    }
}
