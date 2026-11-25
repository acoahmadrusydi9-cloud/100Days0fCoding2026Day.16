import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int min = angka[0];

        for (int i = 1; i < n; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("=== NILAI ARRAY MINIMAL ===");
        System.out.println("\nNilai minimal dalam array adalah: " + min);

        sc.close();
    }
}

