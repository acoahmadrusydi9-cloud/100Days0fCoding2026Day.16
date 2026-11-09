import java.util.Scanner;

public class soal2{
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

    System.out.print("Masukkan nilai N: ");
    int n = sc.nextInt();

    if (n<=1) {
    System.out.println("Nilai N harus lebih besar atau sama dengan 1.");
    } else {
     for (int i = n; i>=1; i--) {
           for(int j= i; j>=1;j--){
                  System.out.print(j +" ");
             }
             System.out.println();
     }
            
     }
    sc.close();
   }
}
import java.util.Scanner;
public class soal3{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
      int A=sc.nextInt();
      int B=sc.nextInt();
      int C =0;
        
      for(int i = A; i<B;i++){
         if(i%2==0&&i%3==0) {
              System.out.print(i+" ");
              C++;
           }
       }System.out.println();
       System.out.println(C);
} 
}
