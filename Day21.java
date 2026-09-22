import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.print("Masukkan nilai String: ");
        String a = st.nextLine();
        int b = Integer.parseInt(a);
        short c = Short.parseShort(a);
        byte d = Byte.parseByte(a);
        long e = Long.parseLong(a);
        float g = Float.parseFloat(a);
        double h = Double.parseDouble(a);
        char i = a.charAt(0);
        
        System.out.println("\n=== KONFERSI STRING > Tipe Data ===");
        System.out.println("Nilai dari String: " + a);
        System.out.println("Nilai dari Int: " + b);
        System.out.println("Nilai dari Short: " + c);
        System.out.println("Nilai dari byte: " + d);
        System.out.println("Nilai dari long: " + e);
        System.out.println("Nilai dari float: " + g);
        System.out.println("Nilai dari double: " + i);

        st.close();
        

    }
}

