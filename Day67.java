import java.util.Scanner;

public class Day67{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah sisi : ");
		int s= sc.nextInt();
		
		System.out.println("Hasil dari jumalah sisi dari " + s + " x " + s + "= ");
		
		if (s <= 0){
			System.out.println("Angka harus lebih dari nol");
		} else {
			for (int i=0;i<s;i++){
			for (int j=0;j<s;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		} 
		
		
  }
} 
