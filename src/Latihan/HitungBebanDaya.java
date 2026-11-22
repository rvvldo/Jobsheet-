package Latihan;
import java.util.Scanner;

class HitungBebanDaya {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);
        
        int subStasiun = 3;
        int zonaKlaster = 4;
        int akumulasiSemua = 0;

        for(int i = 1; i <= subStasiun; i++) {
            int totalSubStasiun= 0;
            int statusKritis = 0;
            
            System.out.println("Sub stasiun " + i);
            
            for(int j = 1; j <= zonaKlaster; j++) {
            int bebanDaya;
            int jumlahBeban = 0;
            int akumulasiBeban = 0;
            double rataBeban = 0;
            int dataValid = 0;
            
            do {
                System.out.print("Masukkan beban daya (Kwh): ");
                bebanDaya = aldo.nextInt();
                if (bebanDaya < 0) {
                    System.out.println("Peringatan: Inputan gagal");
                    continue;
                } else {
                    akumulasiBeban += bebanDaya;
                    dataValid++;
                    jumlahBeban++;
                };
                
            } while(bebanDaya != 0);
                
            rataBeban = (double) akumulasiBeban / jumlahBeban;
            if (akumulasiBeban > 150) {
                System.out.println("Klaster: Kritis");
                System.out.println("Total beban zona" + j + " : " + akumulasiBeban);
                System.out.println("Rata rata beban data valid" + rataBeban);
                statusKritis++;
            } else {
                System.out.println("Klaster: Aman");
                System.out.println("Total beban zona" + j + " : " + akumulasiBeban);
                System.out.println("Jumlah data valid " + dataValid);
                
            }
             totalSubStasiun += akumulasiBeban;
        }
            System.out.println("Total beban per sub stasiun: " + totalSubStasiun);
            System.out.println("Total status kritis ditemukan: " + statusKritis);
            akumulasiSemua += totalSubStasiun;
        }

        System.out.println("Total akumulasi semua: " + akumulasiSemua);
    }
}
