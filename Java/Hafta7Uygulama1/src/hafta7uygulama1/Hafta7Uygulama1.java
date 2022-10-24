package hafta7uygulama1;
import javax.swing.JOptionPane;
public class Hafta7Uygulama1 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("1. Kenari Giriniz: ");
        int k1 = Integer.parseInt(s1);
        String s2 = JOptionPane.showInputDialog("2. Kenari Giriniz: ");
        int k2 = Integer.parseInt(s2);
        
        Kare k = new Kare(k1, k2);
        System.out.println("Alan: " + k.alanBul());
        System.out.println("Cevre: " + k.cevreBul());
        
    }
    
}
