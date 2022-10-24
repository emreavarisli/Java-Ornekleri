package hafta5uygulama1;
import javax.swing.JOptionPane;
public class Hafta5Uygulama1 {
    public static void main(String[] args) {
        String sayi1 = JOptionPane.showInputDialog("Yarıçapı Giriniz: ");
        
        Degiskenler d = new Degiskenler();
        d.r = Integer.parseInt(sayi1);
        
        Islemler islem = new Islemler();
        double alan = islem.alan(d.r);
        System.out.println("Alan: " + alan);       
        double cevre = islem.cevre(d.r);
        System.out.println("Cevre: " + cevre);
        
    }
    
}
