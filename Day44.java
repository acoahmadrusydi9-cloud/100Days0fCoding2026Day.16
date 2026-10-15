import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        int a = sc.nextInt();
        
        if ( a < 0 || a > 100){
            System.out.println("Masukkan nilai dari 0 sampai dengan 100");
        } else if(a >= 90){
            System.out.println(" Kategori Nilai : A");
        } else if(a >= 80){
            System.out.println(" Kategori Nilai : B");
        } else if (a >= 70){
            System.out.println(" Kategori Nilai : C");
        } else if (a >= 60){
            System.out.println(" Kategori Nilai : D");
        } else if (a >=50){
            System.out.println(" Kategori Nilai : E");
        } else {
            System.out.println(" Mengulang!!");
        }
        sc.close();
    }
}
