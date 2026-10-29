import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        

        System.out.println("\n--- Hasil ---");
        
        System.out.print("Angka ganjil dari " + n + " ke bawah: ");
        for (int i = n; i >= 1; i--) {
             if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Angka genap dari " + n + " ke bawah: ");
        for (int i = n; i >= 0; i--) {
             if (i % 2 == 0 && i > 0) { // i > 0 opsional jika ingin mengecualikan angka 0
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
