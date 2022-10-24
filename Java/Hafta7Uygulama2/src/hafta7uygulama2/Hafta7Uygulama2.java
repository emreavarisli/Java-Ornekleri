package hafta7uygulama2;
import javax.swing.JOptionPane;
public class Hafta7Uygulama2 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Yarıçapı Girin: ");
       int sayi = Integer.parseInt(s1);
       Daire da = new Daire();
       
       da.alanBul(sayi);
       da.cevreBul(sayi);
       System.out.println("Alan: " + da.getAlan());
       System.out.println("Cevre: " + da.getCevre());
    }
    
}
