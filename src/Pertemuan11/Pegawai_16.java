package Pertemuan11;
import java.util.Scanner;

public class Pegawai_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        int hari = 5;
        int jumlahPegawai = 0;
        boolean tambahPegawai;
        int jumlahLembur = 0;
        int jumlahTidakLembur = 0;

        do {
            System.out.print("Nama pegawai: ");
            String namaPegawai = aldo.nextLine();

            int totalJamKerja = 0;
            int jamKerjaTerbanyak = 0;
            String status = "Tidak Lembur";

            for(int i = 1; i <= hari; i++) {
                System.out.print("Jam kerja hari " + i + " : ");
                int jamKerja = aldo.nextInt();
                if (jamKerja >= 0 && jamKerja <= 12) {
                    if (jamKerja > jamKerjaTerbanyak) {
                        jamKerjaTerbanyak = jamKerja;
                    }
                    totalJamKerja += jamKerja;
                    if (totalJamKerja > 40) {
                        status = "Lembur";
                        jumlahLembur++;
                    } 
                } else {
                    System.out.println("Jam tidak valid, ulangi!");
                    do {
                        System.out.print("Jam kerja hari " + i + " : ");
                        jamKerja = aldo.nextInt();
                    } while (jamKerja < 0 && jamKerja > 12);
                    if (jamKerja > jamKerjaTerbanyak) {
                        jamKerjaTerbanyak = jamKerja;
                    }
                    totalJamKerja += jamKerja;
                    if (totalJamKerja > 40) {
                        status = "Lembur";
                        jumlahLembur++;
                    }  
                }
            }

            if (status != "Lembur") {
                jumlahTidakLembur++;
            }

            jumlahPegawai++;
            System.out.println("Nama pegawai: " + namaPegawai);
            System.out.println("Status: " + status);
            System.out.print("Tambah pegawai? (true/false): ");
            tambahPegawai = aldo.nextBoolean();

            aldo.nextLine();

        } while(tambahPegawai == true);

        System.out.println("Jumlah pegawai: " + jumlahPegawai);
        System.out.println("Jumlah lembur: " + jumlahLembur);
        System.out.println("Jumlah tidak lembur: " + jumlahTidakLembur);

        aldo.close();
    }
}

// Nama pegawai: Sari 
// Jam kerja hari 1 : 8
// Jam kerja hari 2 : 9
// Jam kerja hari 3 : 13
// Jam tidak valid, ulangi!
// Jam kerja hari 3 : 10
// Jam kerja hari 4 : 8
// Jam kerja hari 5 : 9
// Nama pegawai: Sari 
// Status: Lembur
// Tambah pegawai? (true/false): true
// Nama pegawai: Joko
// Jam kerja hari 1 : 4
// Jam kerja hari 2 : 4
// Jam kerja hari 3 : 4
// Jam kerja hari 4 : 4
// Jam kerja hari 5 : 4
// Nama pegawai: Joko
// Status: Tidak Lembur
// Tambah pegawai? (true/false): true
// Nama pegawai: Aris
// Jam kerja hari 1 : 4
// Jam kerja hari 2 : 4
// Jam kerja hari 3 : 4
// Jam kerja hari 4 : 4
// Jam kerja hari 5 : 4
// Nama pegawai: Aris
// Status: Tidak Lembur
// Tambah pegawai? (true/false): false
// Jumlah pegawai: 3
// Jumlah lembur: 1
// Jumlah tidak lembur: 2
// PS C:\Users\WINDOWS 11\PrakDasPro_> 