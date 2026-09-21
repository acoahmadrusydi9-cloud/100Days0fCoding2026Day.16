import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        //Tipe data Int ke String
        System.out.print("Masukkan angka bulat (int): ");
        int a = sc.nextInt();
        String strFromInt = String.valueOf(a);

        //Tipe data double ke String
        System.out.print("Masukkan angka desimal (double): ");
        double b = sc.nextDouble();
        String strFromDouble = String.valueOf(b);

        //Tipe data boolean ke String
        System.out.print("Masukkan status (boolean): ");
        boolean c = sc.nextBoolean();
        String strFromBoolean = String.valueOf(c);

        //Tipe data char ke String
        System.out.print("Masukkan satu karakter (char): ");
        char d = sc.next().charAt(0);
        String strFromChar = String.valueOf(d);

        System.out.println("\n ---- HASIL KONFERSI KE STRING---");
        System.out.println("String dari int      : " + strFromInt + "(panjang karakter: " + strFromInt.length() + ")");
        System.out.println("String dari double   : " + strFromDouble);
        System.out.println("String dari boolean  : " + strFromBoolean);
        System.out.println("String dari char     : " + strFromChar);








        
    }
}
