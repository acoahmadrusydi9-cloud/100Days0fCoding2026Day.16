import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah indeks pada array : ");
        int j = sc.nextInt();
        
        int [] angka = new int[j];
        
        for(int i = 0; i < j; i++){
            System.out.print("Masukkan elemen array -"+(i+1)+": ");
            angka[i] = sc.nextInt();
        }
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = sc.nextInt();
        
        int posisiIndex = -1;
        for ( int i = 0; i < angka.length; i++){
            if(angka[i] == target){
                posisiIndex = i;
                break;
            }
        }
        
        if (posisiIndex != -1){
            System.out.println("Angka "+ target + " ditemukan ditemukan pada index ke -"+ posisiIndex + ". ");
        } else {
            System.out.println("Angka " + target + " Tidak ditemukan");
        }
        
        sc.close();
        
    }
    
}
