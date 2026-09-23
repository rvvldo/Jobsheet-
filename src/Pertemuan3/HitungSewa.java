package Pertemuan3;
public class HitungSewa {
    public static void main(String[] args) {
        int alas = 25;
        int tinggi = 10;
        
        // Bug 1: Hasil luas segitiga tidak sesuai
        float luas = (float) 1/2 * alas * tinggi; 

        // Bug 2: Data Loss saat Type Casting
        byte kapasitasToko =  (byte) 140; 

        System.out.println("Luas Area : " + luas);
        System.out.println("Kapasitas Toko: " + kapasitasToko);
    }
}