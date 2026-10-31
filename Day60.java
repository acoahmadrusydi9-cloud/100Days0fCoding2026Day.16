import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        int total = 0;

        
        for (int i = 1; i <= n; i++) {
            total += i;  
        }
        
        System.out.println("Jumlah angka dari 1 sampai " + n + " adalah: " + total);
        sc.close();
    }
}
