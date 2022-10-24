package hafta6uygulama3;
import java.util.Scanner;
public class Hafta6Uygulama3 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sınav1 giriniz: ");
        int a = girdi.nextInt();
        System.out.print("Sınav2 giriniz: ");
        int b = girdi.nextInt();
        
        Metotlar metot = new Metotlar(a, b);
        System.out.println("Sonuc: " + metot.sonuc);
    }
    
}
