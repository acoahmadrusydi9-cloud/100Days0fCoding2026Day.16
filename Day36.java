import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tentukan Bilangan Dari : ");

        int a = sc.nextInt();
        if(a % 2 == 0 ) {
            System.out.println("Dikategorikan Bilangan GENAP");

        }else{
            System.out.println("Dikategorikan Bilangan GANJIL");
        }
    }
}
