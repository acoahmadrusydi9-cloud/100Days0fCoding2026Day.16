import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
    	System.out.print("Masukkan operator ( + , - , * , / ) : ");
    	char o = sc.next().charAt(0);
    	System.out.print("Masukkan angka kedua : ");
    	int b = sc.nextInt();
        
    	int h = 0;
    	switch (o) {
	case '+': 
    		h = a + b;
    		break;
    case '-':
    		h = a - b;
    		break;
    case '*':
    		h = a * b;
    		break;
    case '/':
    		int statusNol = (b == 0) ? 1 : 0;
                
                switch (statusNol) {
                    case 1:
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                        break;
                    case 0:
                        h = a / b;
                        break;

	default: 
                	System.out.println("Error, Masukkan operator ( +,-,*,/).");
		break;
            }
    	}
      System.out.println("Hasil : " + a + " " + o + " " + b + " = " + h);  
    } 
} 

