import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka  : ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println( "Positif" + a);
        } else if ( a < 0) {
            System.out.println("Negatif" + a);
        } else {
            System.out.println("Angka Netral");
        }
        sc.close();
    }   

    
}
