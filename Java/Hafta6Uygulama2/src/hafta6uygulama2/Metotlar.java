package hafta6uygulama2;
public class Metotlar {
    double sayi;
    
    public Metotlar(double sayi){
        this.sayi = sayi;
    }
    
    public int islem(){
        double tamSayi = Math.ceil(sayi);
        if(tamSayi % 2 == 0)
            return 2;
        else 
            return 1;
    }
}
