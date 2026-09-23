package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang16 {
    public static void main(String[] args) {
    int panjang;
    int lebar;
    int luas;

    Scanner aldo = new Scanner(System.in);

    System.out.print("Masukkan panjang: ");
    panjang = aldo.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = aldo.nextInt();

    luas = panjang * lebar;
    System.out.println("Luas persegi panjang adalah " + luas);

    }
}
