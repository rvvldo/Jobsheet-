package Pertemuan7;
import java.util.Scanner;

public class Kasus{
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        double tarifDasar;
        
        System.out.print("Masukkan kode hari: ");
        int kodeHari = aldo.nextInt();

        System.out.print("Masukkan usia: ");
        int usiaPembeli = aldo.nextInt();

        switch(kodeHari) {
            case 1:
                tarifDasar = 50000;
                if(usiaPembeli < 5) {
                    tarifDasar = tarifDasar - (1.0 * tarifDasar);
                } else if (usiaPembeli >= 5 && usiaPembeli <= 12) {
                    tarifDasar = tarifDasar - (0.2 * tarifDasar);
                } else if (usiaPembeli >= 13 && usiaPembeli <= 59) {
                    tarifDasar += 0;
                } else {
                    tarifDasar = tarifDasar - (0.3 * tarifDasar);
                } 
                System.out.println((int)tarifDasar);
            break;
            case 2:
                tarifDasar = 75000;
                if(usiaPembeli < 5) {
                    tarifDasar = tarifDasar - (1.00 * tarifDasar);
                } else if (usiaPembeli >= 5 && usiaPembeli <= 12) {
                    tarifDasar = tarifDasar - (0.2 * tarifDasar);
                } else if (usiaPembeli >= 13 && usiaPembeli <= 59) {
                    tarifDasar += 0;
                } else {
                    tarifDasar = tarifDasar - (0.3 * tarifDasar);
                }
                System.out.println((int)tarifDasar);
            break;
            default:
                System.out.println("Kode hari tidak valid");
        }
    }
};