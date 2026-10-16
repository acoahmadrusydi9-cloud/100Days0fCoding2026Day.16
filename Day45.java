import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukkan operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua  : ");
        int b = sc.nextInt();
        int hasil;
        
        switch (operator) {
            case '+':
                hasil = a + b;
                System.out.println("Hasil: " + a + " + " + b + " = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("Hasil: " + a + " - " + b + " = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasil: " + a + " * " + b + " = " + hasil);
                break;
            case '/':
                 
                int statusBagi = (b == 0) ? 0 : 1;
                
                switch (statusBagi) {
                    case 0:
                        System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan!");
                        break;
                    case 1:
                        hasil = a / b;
                        System.out.println("Hasil (Pembagian): " + a + " / " + b + " = " + hasil);
                        break;
                }
                break; 

            default:
                System.out.println("Operator tidak dikenali.");
        } 
        sc.close();
    } 
} 
