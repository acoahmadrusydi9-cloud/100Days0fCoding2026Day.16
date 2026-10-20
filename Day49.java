import java.util.Scanner;

public class Day49{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");

        int a = sc.nextInt();

        String b = (a > 0) ? "positf" : "negatif";

        System.out.println(b);
        sc.close();




    }
    
}
