package hafta3uygulama2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Hafta3Uygulama2 {
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz: ");
        Double sayi1 = girdi.nextDouble();
        System.out.print("2. Sayiyi Giriniz: ");
        Double sayi2 = girdi.nextDouble();
        System.out.print("Yapmak Istediğiniz Islemi Giriniz: ");
        char isaret = girdi.next().charAt(0);
        
        switch (isaret) {
            case '+':
                System.out.println("Sonuc: " + Hesap.toplama(sayi1, sayi2));
                break;
            case '-':
                System.out.println("Sonuc: " + Hesap.cikarma(sayi1, sayi2));
                break;
            case '*':
                System.out.println("Sonuc: " + Hesap.carpma(sayi1, sayi2));
                break;
            default:
                System.out.println("Sonuc: " + Hesap.bolme(sayi1, sayi2));
                break;
        }
    }
    
}
