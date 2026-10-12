import java.util.Scanner;

public class Latihan {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan suhu ruangan (*C)= ");
    double suhu = sc.nextDouble();
    
    if (suhu <= 16 ){
      System.out.println("Status : Suhu ruangan Dingin (Cold)");
      System.err.println("Pucuk dingin Cuyyy :)");
    } else if (suhu >= 16 && suhu <= 25) {
      System.out.println("Status : Suhu ruangan Nyaman (Bagi saya) ");
    } else if (suhu > 25 && suhu < 30) {
      System.out.println("Status : Suhu rungan berasa di sauna (In This Ekonmi)");
    } else {
      System.out.println("Status : Ruang Kelas Teknik Gedung B_Ytta");
    }
    sc.close();
    
  }
}
