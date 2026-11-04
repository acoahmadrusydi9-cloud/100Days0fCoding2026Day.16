import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int m = sc.nextInt();
        System.out.print("Masukkan pangkat dari " + m +": ");
        int n = sc.nextInt();
        long h = 1;
        if (n < 0) {
            System.out.println("Nilai n harus lebih dari atau sama dengan 0.");
            
        } else {
            for (int i = 1; i <= n; i++) {
                long perkalian = 0;
                for (int j = 1; j <= m; j++) {
                    perkalian += h;
                }
                h = perkalian;
            }
            System.out.println("Hasil\t:" + h);
        }
        sc.close();
    }
}
