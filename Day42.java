import java.util.Scanner;

public class Day42 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Masukkan Gaji pokok : Rp ");
        int G = sc.nextInt();
        System.out.print("Masukkan Tunjangan  : Rp " );
        int T = sc.nextInt();
        System.out.print("Masukkan Pajak      : Rp " );
        int P = sc.nextInt();
        
        double gB= G + T - P;
        System.out.printf("Gaji Bersih = Rp " + gB +"Juta (ID) loh ya bukan ($) ");
        
    }
    
    
}
