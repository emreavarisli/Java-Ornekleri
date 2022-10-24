package hafta7uygulama1;
public class Kare {
    private int kenar1, kenar2;
    private double alan, cevre;
    
    public Kare(){
        kenar1 = 0;
        kenar2 = 0;
    }
    
    public Kare(int kenar1, int kenar2){
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }
    
    double alanBul(){
        alan = kenar1 * kenar2;
        return alan;
    }
    
    double cevreBul(){
        cevre = (kenar1 + kenar2) * 2;
        return cevre;
    }
    
    public void setAlan(double alan) {this.alan = alan;}
    public double getAlan() {return alan;}
    public void setCevre(double cevre) {this.cevre = cevre;}
    public double getCevre() {return cevre;}
}
