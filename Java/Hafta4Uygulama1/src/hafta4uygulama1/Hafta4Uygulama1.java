package hafta4uygulama1;
import java.util.Scanner;
public class Hafta4Uygulama1 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        double kenar1 = girdi.nextDouble();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        double kenar2 = girdi.nextDouble();
        
        Bul b = new Bul();
        double sonucAlan = b.alanBul(kenar1, kenar2);
        double sonucCevre = b.cevreBul(kenar1, kenar2);
        System.out.println("Alan: " + sonucAlan);
        System.out.println("Cevre: " + sonucCevre);
    }
    
}
