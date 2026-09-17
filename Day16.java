
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai A: ");
        int A = in.nextInt();

        System.out.print("Masukkan NIlai B: ");
        int B = in.nextInt();

        int hasilModulus = A % B;
        System.out.println("Sisa bagi dari " + A + " % " + B + " adalah " + hasilModulus);




    }
}
