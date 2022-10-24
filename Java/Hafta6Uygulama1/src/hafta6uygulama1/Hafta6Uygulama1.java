package hafta6uygulama1;
import javax.swing.JOptionPane;
public class Hafta6Uygulama1 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Eni Giriniz: ");
        String s2 = JOptionPane.showInputDialog("Boyu Giriniz: ");
        String s3 = JOptionPane.showInputDialog("Yuksekligi Giriniz: ");
        double sayi1 = Double.parseDouble(s1);
        double sayi2 = Double.parseDouble(s2);
        double sayi3 = Double.parseDouble(s3);
                
        Metotlar metot = new Metotlar(sayi1, sayi2, sayi3);
        double hacim = metot.hacim();
        System.out.println("Hacim: " + hacim);
        
     
        
    }
}
