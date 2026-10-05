import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Umur : ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Kategori : Usia tidak valid.");
        } else if ( a <= 13){
            System.out.println("Kategori : Anak - anak.");
        } else if ( a <= 17){
            System.out.println("Kategori : Remaja.");
        } else if ( a <= 60) {
            System.out.println("Kategori : Langsia.");
        }

        sc.close();
    }
    
}
