import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.println("Jumlah Huruf dalam teks = " + nama.length());;
        System.out.println("Teks berubah Kapital = " + nama.toUpperCase());
        System.out.println("Teks berubah Hruf kecil = " +nama.toLowerCase());
        
        System.out.println("===========");
        String namaGoat = "Ronaldo";
        System.out.print("Masukkan nama goat pesepak bola yang Ad di pikiranmu : ");
        String nama2 = sc.nextLine();
        
        System.out.println("Goat kita sama/tidak : " + nama2.equals(namaGoat));
        System.out.println("Teh real goat kita / pendapat kita beda : " + nama2.equalsIgnoreCase(namaGoat));
        System.out.println("");
        System.out.println("Mengandung kata yang dicari: "+ nama2.contains(namaGoat));
        System.out.println("Apakah teks kosong: "+ nama2.isEmpty());
        
        
        System.out.println("============");
             System.out.print("Masukkan sebuah teks (dengan spasi di awal/akhir): ");
        String inputAsli = sc.nextLine();

        String hasilTrim = inputAsli.trim();
        System.out.println("\n--- Hasil trim() ---");
        System.out.println("Teks: \"" + hasilTrim + "\"");

        System.out.print("\nMasukkan kata yang ingin diganti (dari teks yang sudah di-trim): ");
        String target = sc.next();
        System.out.print("Ganti dengan kata: ");
        String pengganti = sc.next();

        String hasilReplace = hasilTrim.replace(target, pengganti);
        System.out.println("--- Hasil replace() ---");
        System.out.println("Teks baru: " + hasilReplace);

        System.out.println("\n--- Hasil substring() ---");
        if (hasilTrim.length() >= 5) {
            String potongAwal = hasilTrim.substring(0, 5);
            String potongSisa = hasilTrim.substring(5);
            
            System.out.println("Potongan (0 s.d 5): " + potongAwal);
            System.out.println("Sisa teks (dari indeks 5): " + potongSisa);
        } else {
            System.out.println("Teks terlalu pendek untuk dipotong (kurang dari 5 karakter).");
        }

        sc.close();


        

        
        
    }
    
}
