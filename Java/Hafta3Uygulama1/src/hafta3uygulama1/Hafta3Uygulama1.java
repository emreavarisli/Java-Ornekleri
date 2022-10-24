package hafta3uygulama1;
import javax.swing.JOptionPane;
public class Hafta3Uygulama1 {
    public static void main(String[] args) {
        String isim = JOptionPane.showInputDialog("Bir İsim Giriniz: ");
        String soyIsim = JOptionPane.showInputDialog("Bir Soyisim Giriniz: ");
        
        MetinIslemleri.birlestir(isim, soyIsim);
        MetinIslemleri.uzunlukBul(isim, soyIsim);
    }
    
}
