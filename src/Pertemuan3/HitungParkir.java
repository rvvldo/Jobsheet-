package Pertemuan3;
public class HitungParkir {

    public static void main(String[] args) {
        int totalDetik = 3725;
        int jam = totalDetik / 3600;
        int menit = totalDetik % 3600 / 60;
        int detik = totalDetik % 60;

        System.out.println("HASIL: " + jam + " " + menit + " " + detik);
        
    }
}