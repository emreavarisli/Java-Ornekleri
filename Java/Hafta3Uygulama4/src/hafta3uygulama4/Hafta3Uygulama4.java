package hafta3uygulama4;
import java.util.Scanner;
public class Hafta3Uygulama4 {
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        System.out.print("Faktoriyeli Alincak Sayi: ");
        int sayi = girdi.nextInt();
        
        Metotlar metot = new Metotlar();
        System.out.println("Sonuc: " + metot.Hesap(sayi));
        
    }
    
}
