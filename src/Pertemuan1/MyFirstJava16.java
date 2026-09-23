package Pertemuan1;
public class MyFirstJava16 {
    public static void main(String[] args) {
        
        System.out.println("Nama saya adalah Muhammad Revaldo Irfan Sudrajat");

        MyFirstJava16 objek = new MyFirstJava16();

        int hasil = objek.tambahAngka(5, 10);
        System.out.println(hasil);
    }

    public int tambahAngka (int a, int b) {
        int c = a + b;
        return c;
    }
}
