import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kehadiran : ");
        int hadir = sc.nextInt();

        if (tugas >= 75) {
            if (hadir >= 90) {
                System.out.println("Dinyatakan Lulus");
            } else {
                System.out.println("Lulus bersyarat, Namun nilai kehadiran KURANG");
            } 
            
        } else if (tugas <=75) {
            if (hadir >= 90) {
                System.out.println("Lulus bersyrat, namun nilai tugas KURANG");
            }else {
                System.out.println("Tidak KURANG, kedua nilai KURANG");
            }
        }

    }
}  

