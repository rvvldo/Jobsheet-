package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = aldo.nextLine();
            System.out.print("Masukkan baris: ");
            baris = aldo.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = aldo.nextInt();

            aldo.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = aldo.nextLine();

            if(pilihan.equalsIgnoreCase("n")) {
                break;
            }


        }
    }
}
