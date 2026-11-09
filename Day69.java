import java.util.Scanner;

public class Day69{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan jumlah kolom: ");
        int k= sc.nextInt();
        System.out.print("Masukkan jumlah baris: ");
        int b=sc.nextInt();
        for(int i = 1; i <=k; i++){
            for(int j = 1; j <=b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}    
}
