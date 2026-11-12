import java.util.Scanner;

public class Day72{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int angka;

        System.out.println("Masukkan angka negatif untuk mengetahui total jumalah.\n");

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = sc.nextInt();

             if (angka < 0) {
                System.out.println("\nAngka negatif terdeteksi. Program berhenti.");
                break; 
             }

            total += angka;
        }
        System.out.println("---------------------------------");
        System.out.println("Total jumlah angka adalah: " + total);
        
        sc.close();
    }
}
