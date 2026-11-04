import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int n = sc.nextInt();
        
        long faktorial = 1; 
        
        if (n<1){
           System.out.println("angka faktorial tidak di perbolehkan kurang dari (0)");
        } else{
             for (int i = 1; i <= n; i++) {
            faktorial *= i; 
                 System.out.println("hasil Faktorial (" + n + ") adalah: " + faktorial);

        }
        }
        sc.close();
    }
}
