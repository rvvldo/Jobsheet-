package Pertemuan5;
import java.util.Scanner;

public class TugasParkir16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);
        int lama_parkir, total_tarif;

        System.out.print("Masukkkan lama parkir (jam): ");
        lama_parkir = aldo.nextInt();

        if(lama_parkir <= 2) {
            total_tarif = 2000;
        } else {
            total_tarif = 2000 + ((lama_parkir - 2) * 1000);
        }
        
        System.out.println(total_tarif);
    }
}
