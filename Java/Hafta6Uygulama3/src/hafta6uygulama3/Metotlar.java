package hafta6uygulama3;
public class Metotlar {
    double sinav1;
    double sinav2;
    double sonuc;
    
    public Metotlar(){
        sinav1 = 30;
        sinav2 = 30;
        sonuc = (sinav1 + sinav2) / 2;
        //System.out.println("Sonuc: " + sonuc);
    }
    public Metotlar(int a, int b){
        sinav1 = a;
        sinav2 = b;
        sonuc = (sinav1 + sinav2) / 2;
        //System.out.println("Sonuc: " + sonuc);
    }
}
