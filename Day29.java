import java.util.Scanner;

public class  Day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Masukkan  a : ");
        int a = input.nextInt();


        System.out.print("Masukkan  b : ");
        int b = input.nextInt();

        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
    }
}
