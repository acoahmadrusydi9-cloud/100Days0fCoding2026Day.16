import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai kedua   : ");
        int b = input.nextInt();

        System.out.println("Apakah nilai pertama  >= ? " + (a >= b));
        System.out.println("Apakah nilai pertama  <= ? " + (a <= b));
    }
    
}
