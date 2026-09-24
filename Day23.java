import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi: ");
        double sisi = sc.nextDouble();

        double luas = sisi * sisi;

        System.out.println("Luas persegi adala: " + luas);

        sc.close();
    }
}
