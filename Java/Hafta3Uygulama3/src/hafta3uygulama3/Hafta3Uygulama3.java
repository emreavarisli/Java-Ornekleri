package hafta3uygulama3;
import javax.swing.JOptionPane;
public class Hafta3Uygulama3 {
    public static void main(String[] args) {
       String s1 = JOptionPane.showInputDialog("Bir Sayi Giriniz: ");
       int sayi1 = Integer.parseInt(s1);
       
       Sinif uygulama = new Sinif();
       uygulama.Hesap(sayi1);   
    } 
    
}
