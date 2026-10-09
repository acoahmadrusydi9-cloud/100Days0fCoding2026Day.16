import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\t=== MENU WARUNG ===");
            System.out.println("1. Nasi Goreng Mercon : Rp 15.000");
            System.out.println("2. Mie Ayam Pangsit   : Rp 12.000");
            System.out.println("3. Es Teh Manis       : Rp 5.000");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");

            int pilihan = sc.nextInt();

            System.out.println("\n\t=== PESANAN ANDA ===");
            if (pilihan == 1) {
                System.out.println("--> Anda memesan Nasi Goreng Mercon. Harga: Rp 15.000");
            } else if (pilihan == 2) {
                System.out.println("--> Anda memesan Mie Ayam. Harga: Rp 12.000");
            } else if (pilihan == 3) {
                System.out.println("--> Anda memesan Es Teh Manis. Harga: Rp 5.000");
            } else  if (pilihan  == 4) {
                System.out.println("--> Terima Kasih Telah Berkunjung");
            } else {
                System.out.println("Pilihan Tidak valid! Silahkan Memilih Menu 1-4. ");
            } 
        sc.close();
    }

    
}
