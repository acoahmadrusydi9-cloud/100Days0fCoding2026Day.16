import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        System.out.print("Masukkan Nilai Dari -127 < 128: ");
        byte a = input.nextByte();
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("NIlai Byte\t: " + a);
        System.out.println("NIlai Short\t: " + b);
        System.out.println("NIlai Int\t: " + c);
        System.out.println("NIlai Long\t: " + d);
        System.out.println("NIlai Float\t: " + e);
        System.out.println("NIlai Double\t: " + f);

        


    }    

}
    
