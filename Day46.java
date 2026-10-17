import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nomor dari ( 1 - 7 ) untuk menetukan Hari : ");
        
        int nh = sc.nextInt();
        String h = sc.nextLine();
        
        switch (nh) {
	case 1: 
            h = "Senin";
            break;
    case 2:
            h = "Selasa";
            break;
    case 3:
            h = "Rabu";
            break;
    case 4:
            h = "Kamis";
            break;
    case 5:
            h = "Jum'at";
            break;
    case 6: 
            h = "Sabtu"; 
            break;
    case 7:
            h = "Ahad";
            break;
	default:
            h = "Invalid Tolong masukkan angka 1 sampai dengan 7";
		break;
        }
        System.out.println("Hari : "+ h);
        sc.close();
    } 
} 
