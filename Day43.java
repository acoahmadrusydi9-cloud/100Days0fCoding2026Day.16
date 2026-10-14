import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print(" Masukkan angka kelipatan dari 3/5  = ");
    	 int ak = sc.nextInt();
    	 
    	 if(ak %3 == 0 && ak %5 == 0) {
    	 	 System.out.println( "angka " + ak + " kelipatan dari 3 & 5");
    	 } else if ( ak %3 == 0){
    	 	 System.out.println("angka " + ak + " adalah Kelipatan 3");
    	 } else if ( ak % 5 == 0){
    	 	 System.out.println("angka " + ak + " adalah kelipatan 5");
    	 } else {
    	 	 System.out.println("angka " + ak + " Bukan kelipatan 3 / 5");
    	 }
    	    
         sc.close();
    }
}
