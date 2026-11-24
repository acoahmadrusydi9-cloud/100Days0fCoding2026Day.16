import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        
        int nilai [] = new int[n];
        int m = nilai[0];
        System.out.println("Masukkan nilai dari " + n + " index:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan Angka ke-"+(i+1)+": ");
            nilai[i]=sc.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > m) {
                m = nilai[i];  
            }
            
        }
        System.out.println("\n==Angka Maksimal==");
        System.out.println("Angka Maksimal adalah: "+ m);
        sc.close();
    }
}
