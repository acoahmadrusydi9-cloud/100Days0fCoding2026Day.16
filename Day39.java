import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil =0;
        char operator;
        boolean valid = true;

        System.out.println("\n\t=== KALKULATOR SEDERHANA ===");

        System.out.print("Masukkan Angka Pertama : ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan Operator ( + , - , * , / ) : ");
        operator = sc.next().charAt(0);
        System.out.print("Masukkan Angka Kedua : ");
        angka2 = sc.nextDouble();
       
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*'){
            hasil = angka1  * angka2;
        } else if ( operator == '/') {
            hasil = angka1 / angka2;
            if (angka2 == 0) {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                valid = false;
            } else {
                hasil = angka1 / angka2;
            }
        } else { 
            System.out.println("Operator tidak valid! Silahkan Memilih Operator +, -, *, /");
            valid = false;
        }
        if (valid) {
            System.out.println("\n\t=== HASIL PERHITUNGAN ===");
            System.out.println("Hasil :" + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        sc.close();
    }
}
