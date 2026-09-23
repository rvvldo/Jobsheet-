package Pertemuan3;
import java.util.Scanner;

public class Tugas1_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);
        double bungaPerbulan;
        double cicilan;
        int harga_laptop; 
        int uang_muka;  
        int sisaHarga;
        int lama_cicilan;

        System.out.print("Masukkan harga laptop: ");
        harga_laptop = aldo.nextInt();
        System.out.print("Masukkan uang muka: ");
        uang_muka = aldo.nextInt();
        System.out.print("Masukkan lama cicilan: ");
        lama_cicilan = aldo.nextInt();

        sisaHarga = harga_laptop - uang_muka;
        bungaPerbulan = sisaHarga * 0.02;
        cicilan = (sisaHarga/lama_cicilan) + bungaPerbulan;

        System.out.println("Jumlah cicilan yang harus dibayar adalah Rp. " + cicilan);
    }    
}
