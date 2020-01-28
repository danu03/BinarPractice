
import java.util.Scanner;

public class IfElseStatement3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("pemain pertama pilih batu, gunting, kertas");
    String pemainPertama = input.next();
    System.out.print("pemain kedua pilih batu, gunting, kertas");
    String pemainKedua = input.next();
    
    if ( (pemainPertama.equalsIgnoreCase("batu") && pemainKedua.equalsIgnoreCase("gunting")) || (pemainPertama.equalsIgnoreCase("gunting") && pemainKedua.equalsIgnoreCase("kertas")) || (pemainPertama.equalsIgnoreCase("kertas") && pemainKedua.equalsIgnoreCase("batu"))) {
      System.out.println("Pemain pertama menang");
    }
    else if ( (pemainPertama.equalsIgnoreCase("gunting") && pemainKedua.equalsIgnoreCase("batu")) || (pemainPertama.equalsIgnoreCase("kertas") && pemainKedua.equalsIgnoreCase("gunting")) || (pemainPertama.equalsIgnoreCase("batu") && pemainKedua.equalsIgnoreCase("kertas"))) {
      System.out.println("Pemain kedua menang");
    }
  }
}