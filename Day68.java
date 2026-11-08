import java.util.Scanner;
public class Day68{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan angka: ");
		int a = sc.nextInt();
		int b = 0;
		
		if (a <=0 && a>= 100){
			System.out.println("Masukkan angka 1 hingga 100");
		}else{
			for (int i=1; i<=a; i+=2){
				System.out.println(i + " ");
				b += i;
			}
			System.out.println();
			System.out.println(b);
		}
		
}
}
