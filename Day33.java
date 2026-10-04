import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        if(nilai >= 70) {
            System.out.print("Selamat Anda Lulus");
        } else {
            System.out.print("Maaf Anda Tidak Lulus");
        }
    }
}
