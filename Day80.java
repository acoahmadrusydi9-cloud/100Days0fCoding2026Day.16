import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        
        int[] angka = {46, 9, 11, 10, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("tercantum beberapa no punggung pemain bola namun tercantum 1 pembalap motoGP dalam Indeks array yang tersedia = 0 sampai 4");
        System.out.print("Masukkan indeks sebagai ghacaan no pemain bola faforitmu: ");
        int indeks = sc.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            System.out.println("Elemen pada indeks " + indeks + " adalah " + angka[indeks]);
        } else {
            System.out.println("Indeks tidak valid. Masukkan indeks dari 0 sampai 4");
        }

        sc.close();
    }
}
