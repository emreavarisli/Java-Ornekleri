package hafta6uygulama2;
import javax.swing.JOptionPane;
public class Hafta6Uygulama2 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Bir Sayi Giriniz: ");
        double sayi = Double.parseDouble(s1);
        
        Metotlar metot = new Metotlar(sayi);
        int sonuc = metot.islem();
        if(sonuc == 2)
            System.out.println("Sayi Cifttir.");
        else if(sonuc == 1)
            System.out.println("Sayi Tektir.");
    }
    
}
