import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris untuk pola bintang: ");
        int ekor = scanner.nextInt();

        System.out.println("\n--- Hasil Pola ---");
        for (int i = 1; i <= ekor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
