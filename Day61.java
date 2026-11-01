import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai N harus lebih besar atau sama dengan 1.");
        } else {
            long hasilKali = 1; 
            for (int i = 1; i <= n; i++) {
                hasilKali *= i; 
            }

            System.out.println("Hasil perkalian angka dari 1 sampai " + n + " adalah: " + hasilKali);
        }
        sc.close();
    }
}
