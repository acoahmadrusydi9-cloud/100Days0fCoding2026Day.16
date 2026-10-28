import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        System.out.print("\nAngka Ganjil 1 sampai " + n + "): ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); 
        
        System.out.print("\nAngka Genap 1 sampai " + n + ":");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
