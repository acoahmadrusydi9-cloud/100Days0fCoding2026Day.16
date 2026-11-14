import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Sebuah Teks: ");
        String teks = sc.nextLine();

        System.out.println("Jumlah Huruf : " + teks.length());
        System.out.println("Huruf Kapital: " + teks.toUpperCase());
        System.out.println("Huruf Kecil: " + teks.toLowerCase());
        sc.close();
    }
}
