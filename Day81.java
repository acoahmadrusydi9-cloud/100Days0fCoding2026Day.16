import java.util.Scanner;

public class Day81{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();

        int[] angka = new int[jumlah];

        System.out.println("\n--- Masukkan nilai elemen array ---");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            angka[i] = sc.nextInt();
        }

        System.out.println("\n--- Isi elemen array ---");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index [" + i + "] = " + angka[i]);
        }

        sc.close();
    }
}
