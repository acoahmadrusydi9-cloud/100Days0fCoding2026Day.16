import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas akhir (N): ");
        int n = sc.nextInt();

        System.out.print("Masukkan angka kelipatan (M): ");
        int m = sc.nextInt();

        System.out.print("Kelipatan " + m + " dari 1 sampai " + n + " adalah: ");

        int hitung = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " "); 
                hitung++;
            }
        }

        if (hitung == 0) {
            System.out.print("Tidak ada kelipatan " + m + " dalam rentang 1 sampai " + n);
        }

        System.out.println();
        sc.close();
    }
}
