import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaAsli = "Rusydi";

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kata = sc.nextLine();
        // Menggunakan equals(). ( untuk membandingkan dua buah string besar / kecil)
        System.out.println("Nama sama persis: "+ nama.equals(namaAsli));
        // Menggunakan equalsIgnoreCase(). (membandingkan dua string tidak peduli besar/kecil)
        System.out.println("Nama sama tanpa membedakan huruf: "+ nama.equalsIgnoreCase(namaAsli));
        // Menggunakan contains(). (menentukan string utama memiliki kesamaan)
        System.out.println("Mengandung kata yang dicari: "+ nama.contains(kata));
        // Menggunakan isEmpty(). (menetukan apakah string kosong)
        System.out.println("Apakah nama kosong: "+ nama.isEmpty());

        sc.close();
    }
}
