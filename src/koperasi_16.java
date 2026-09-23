import java.util.Scanner;

public class koperasi_16 {
    public static void main(String[] args) {
        int paket_alat_tulis = 12000;
        int biaya_modal = 1352500;
        int koperasi_buka = 6;
        int anggota = 8;
        int paket_terjual;
        int pendapatan_kotor_hari;
        int pendapatan_kotor_minggu;
        double gaji_perorang_hari;
        double gaji_perorang_minggu;
        double laba_seminggu;
        double laba_perhari;
        int sisa_kas_perhari;
        int sisa_kas_seminggu;

        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket yang terjual: ");
        paket_terjual = aldo.nextInt();

        pendapatan_kotor_hari = paket_alat_tulis * paket_terjual;
        gaji_perorang_hari = (double) pendapatan_kotor_hari / anggota;
        laba_perhari = (double) pendapatan_kotor_hari - gaji_perorang_hari;
        sisa_kas_perhari = biaya_modal - pendapatan_kotor_hari;

        pendapatan_kotor_minggu = pendapatan_kotor_hari * koperasi_buka;
        laba_seminggu = laba_perhari * koperasi_buka;
        sisa_kas_seminggu = sisa_kas_perhari * koperasi_buka;
        gaji_perorang_minggu = gaji_perorang_hari * koperasi_buka;

        System.out.println("Pendapatan per hari: " + pendapatan_kotor_hari);
        System.out.println("Pendapatan per minggu " +  pendapatan_kotor_minggu);
        System.out.println("Laba per hari : " + (int) laba_perhari);
        System.out.println("Laba per minggu : " + (int) laba_seminggu);
        System.out.println("Bagian anggota per hari: " + gaji_perorang_hari);
        System.out.println("Bagian anggota per minggu: " + gaji_perorang_minggu);
        System.out.println("Sisa kas per hari: " + sisa_kas_perhari);
        System.out.println("Sisa kas per minggu: " + sisa_kas_seminggu);
        
        //Output
        // Masukkan jumlah paket yang terjual: 5
        // Pendapatan per hari: 60000
        // Pendapatan per minggu 360000
        // Laba per hari : 52500
        // Laba per minggu : 315000
        // Bagian anggota per hari: 7500.0
        // Bagian anggota per minggu: 45000.0
        // Sisa kas per hari: 1292500
        // Sisa kas per minggu: 7755000
    }
}
