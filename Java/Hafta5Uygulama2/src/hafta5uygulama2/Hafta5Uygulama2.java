package hafta5uygulama2;
import javax.swing.JOptionPane;
public class Hafta5Uygulama2 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("1. Sayiyi Giriniz: ");
        String s2 = JOptionPane.showInputDialog("2. Sayiyi Giriniz: ");
        String s3 = JOptionPane.showInputDialog("3. Sayiyi Giriniz: ");
        
        Degiskenler deg = new Degiskenler();
        deg.sayi1 = Double.parseDouble(s1);
        deg.sayi2 = Double.parseDouble(s2);
        deg.sayi3 = Double.parseDouble(s3);
        
        Siralama sira = new Siralama();
        System.out.println("En Kucuk: " + sira.kucukSirala(deg.sayi1, deg.sayi2, deg.sayi3));
        System.out.println("Ortanca: " + sira.ortancaSirala(deg.sayi1, deg.sayi2, deg.sayi3));
        System.out.println("En Buyuk: " + sira.buyukSirala(deg.sayi1, deg.sayi2, deg.sayi3));


            
        
    }
    
}
