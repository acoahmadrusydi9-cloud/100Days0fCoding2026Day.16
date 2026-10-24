import java.util.Scanner;

public class Day53{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka bulat selain negatif : ");
        int batas = sc.nextInt();

        int a = 1;

        do {
            System.out.println(a);
            a++;
        } while (a <= batas);
        sc.close();

    }


    
}
