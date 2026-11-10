import java.util.Scanner;

public class Day70{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();
        
        for( int baris = 1; baris<= a ; baris++){
            for( int kolom = 1; kolom <= a - baris; kolom++){
                System.out.print(" ");
            }
            //System.out.println();
            for(int kolom = 1; kolom <= 2*baris-1; kolom++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
}    
}
