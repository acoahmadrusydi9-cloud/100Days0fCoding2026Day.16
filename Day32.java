import java.util.Scanner;

public class Day32{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===  INPUT DATA MAHASISWA ===");

        System.out.print("Masukkan Nilai Ujian 1   : ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan Nilai Ujian 2   : ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan Kehadiran   (%) : ");
        int kehadiran = input.nextInt();
        
        System.out.print("Masukkan Penghasilan Ortu: ");
        double penghasilanOrtu = input.nextDouble();

        double nilaiRataRata = (nilai1 + nilai2) / 2;

        boolean isLulus = (nilaiRataRata >=70) && (kehadiran >=17);

        boolean isBerprestasi = nilaiRataRata >=88;
        boolean isKurangMampu = penghasilanOrtu < 3000000;

        boolean isDapatBeasiswa = isLulus &&(isBerprestasi || isKurangMampu);

        System.out.println("\n=== HASIL EVALUASI MAHASISWA ===");
        System.out.println("Nilai Rata - Rata  : " + nilaiRataRata);
        System.out.println("Status Lulus       : " + isLulus);
        System.out.println("Dapat Beasiswa  : " + isDapatBeasiswa);
        
        int poinKehadiran = 0;
        if (kehadiran == 18) {
            poinKehadiran += 10;
        }
        System.out.println("Bonus Prestasi : + " + poinKehadiran + " poin");

        input.close();
    }
}
