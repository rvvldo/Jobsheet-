package Pertemuan12;
import java.util.Scanner;

public class Tugas2_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("DAFTAR MENU KAFE");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu terlebih dahulu (ketik nama menu): ");
        String cariMenu = aldo.nextLine();
        int indeksCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("Menu tersedia: " + menu[indeksCari] + " (Harga: Rp " + harga[indeksCari] + ")");
        } else {
            System.out.println("Maaf, menu '" + cariMenu + "' tidak tersedia");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesan = aldo.nextInt();
        aldo.nextLine(); 

        String[] daftarPesanan = new String[jumlahPesan];
        int[] hargaPesanan = new int[jumlahPesan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
                String namaInput = aldo.nextLine();

                int indeksMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaInput)) {
                        indeksMenu = j;
                        break;
                    }
                }

                if (indeksMenu != -1) {
                    daftarPesanan[i] = menu[indeksMenu];
                    hargaPesanan[i] = harga[indeksMenu];
                    totalBiaya += harga[indeksMenu];
                    valid = true;
                } else {
                    System.out.println("Menu tidak tersedia di daftar. Silakan masukkan nama menu yang valid.");
                }
            }
        }

        System.out.println("\n STRUK PESANAN ANDA ");
        for (int i = 0; i < jumlahPesan; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " : Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
