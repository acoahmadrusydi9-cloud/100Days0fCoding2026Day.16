import java.util.Scanner;

public class Day28 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan angka awal  : ");
       int a = input.nextInt();

       System.out.print("Masukkan angka kedua : ");
       int b = input.nextInt();

       System.out.printf("Apakah angka sama? : %b%n" , (a == b));
       System.out.printf("Apakah angka tidak sama? : %b%n" , (a != b));

       input.close();
    }
}

