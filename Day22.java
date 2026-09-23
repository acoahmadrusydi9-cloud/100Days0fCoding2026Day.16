
import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Sebelum Di Tukar
        System.out.print("Masukkan nilai A\t: ");
        int A = sc.nextInt();
        System.out.print("Masukkan nilai B\t: ");
        int B = sc.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        //Setelah Di Tukar
        System.out.println(" A = " + A);
        System.out.println(" B = " + B);



        

        sc.close();
    }
}
