import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PENDAFTARAN AKUN ===");
        System.out.print("Buat Username baru: ");
        String usernameTerdaftar = sc.nextLine();

        System.out.print("Buat Password baru: ");
        String passwordTerdaftar = sc.nextLine();

        System.out.println("\nAkun berhasil dibuat! Silakan login untuk masuk ke sistem.\n");
        System.out.println("=================================");
        System.out.println("===      HALAMAN LOGIN        ===");
        System.out.println("=================================");
        boolean isLoginBerhasil = false;

        while (!isLoginBerhasil) {
            System.out.print("Masukkan Username: ");
            String inputUsername = sc.nextLine();

            System.out.print("Masukkan Password: ");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(usernameTerdaftar) && inputPassword.equals(passwordTerdaftar)) {
                System.out.println("\nLogin Berhasil! Selamat datang, " + usernameTerdaftar + "!");
                isLoginBerhasil = true;
            } else {
                System.out.println("\n[GAGAL] Username atau Password salah. Silakan coba lagi.\n");
            }
        }

        sc.close();
    }
}
