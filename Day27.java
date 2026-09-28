import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan angka awal : ");
        int a = sc.nextInt();
        
        //increment
        System.out.println("Hasil Post Increment     : " + a++);
        System.out.println("Hasil setelah Incerement : " + a);
        System.out.println("Hasil Pre Increment      : " + (++a));
        System.out.println("Hasil setelah Increment  : " + a);

        //decrement
        System.out.println("Hasil Post deccrement  : " + a--);
        System.out.println("Hasil setelah decrement: " + a);
        System.out.println("Hasil Pre decremet     : " + (--a));
        System.out.println("Hasil setelah decrement: " + a);

        sc.close();

    }
}
