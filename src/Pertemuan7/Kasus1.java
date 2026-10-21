//Absen = 16
package Pertemuan7;
import java.util.Scanner;

public class Kasus1 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        double diskon = 0;
        int potonganHarga;

        System.out.print("Masukkan kode kategori barang: ");
        int kodeBarang = aldo.nextInt();

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = aldo.nextInt();

        System.out.print("Masukkan status member (True/False): ");
        boolean statusMember = aldo.nextBoolean();

        System.out.print("Masukkan jumlah kantong plastik: ");
        int jumlahKantong = aldo.nextInt();

        switch(kodeBarang) {
            case 1:
                if (totalBelanja >= 200000 && statusMember) {
                    diskon = 0.15 * totalBelanja;
                } else if (totalBelanja >= 200000 || statusMember) {
                    diskon = 0.05 * totalBelanja;
                } else {
                    diskon = 0;
                }
            break;

            case 2:
                if(totalBelanja >= 1000000) {
                    diskon = 0.1 * totalBelanja;
                    if (statusMember) {
                        potonganHarga = 50000;
                        totalBelanja = totalBelanja - potonganHarga;
                    } else {
                        diskon = 0;
                    }
                }
            break;
            
            case 3:
                if (totalBelanja >= 300000) {
                    diskon = 0.2 * totalBelanja;
                } else {
                    diskon = 0.1*totalBelanja;
                }
            break;
            default:
                System.out.println("Kategori barang tidak valid!");
        }

        int biayaPlastik = (statusMember) ? 200 * jumlahKantong : 500 * jumlahKantong;
        double totalBayar = totalBelanja - diskon + biayaPlastik;

        System.out.println(totalBelanja);
        System.out.println(diskon);
        System.out.println(biayaPlastik);
        System.out.println(totalBayar);
    }
}
