package Pertemuan7;
import java.util.Scanner;

public class Kasus2 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan Role (Mahasiswa/Dosen): ");
        String role = aldo.nextLine().trim();
        
        System.out.print("Masukkan username: ");
        String username = aldo.nextLine().trim();
        
        System.out.print("Masukkan password: ");
        String password = aldo.nextLine().trim();
        
        System.out.print("Masukkan kode OTP: ");
        int kodeOTP = aldo.nextInt();

        System.out.print("Masukkan status akun (True/False): ");
        boolean statusAkun = aldo.nextBoolean();
        
        if (statusAkun) {
            if (role.equalsIgnoreCase("Mahasiswa")) {
                if (username.equalsIgnoreCase("mhs_ilkom") && password.equalsIgnoreCase("pas123")) {
                    if (kodeOTP == 554433) {
                        System.out.println("Login berhasil! Selamat datang di portal mahasiswa");
                    } else {
                        System.out.println("Login gagal: kode OTP salah!");
                    }
                } else {
                    System.out.println("Login gagal: username/password mahasiswa salah!");
                }
            } else if (role.equalsIgnoreCase("Dosen")) {
                if (username.equals("dosen_ilkom") && password.equals("dosen456")) {
                    if (kodeOTP == 554433) {
                        System.out.println("Login berhasil! Selamat datang di portal dosen");
                    } else {
                        System.out.println("Login gagal: kode OTP salah!");
                    }
                } else {
                    System.out.println("Login gagal: username/password dosen salah!");
                }
            } else {
                System.out.println("Tidak ada role yang tersedia");
            }
        } else {
            System.out.print("Akses Ditolak: Akun anda sedang terblokir!");
        }
        }
    }
