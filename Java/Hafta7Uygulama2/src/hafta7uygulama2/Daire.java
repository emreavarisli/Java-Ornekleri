package hafta7uygulama2;
public class Daire {
    private double r;
    private double alan, cevre;
    void alanBul(double r)
    {
      alan = Math.PI * r * r;
      
    }
    void cevreBul(double r)
    {
     cevre = 2 * Math.PI * r;
       
    }
    public double getAlan() {
        return alan;
    }

    public double getCevre() {
        return cevre;
    }

    public Daire(double alan, double cevre) {
        this.alan = alan;
        this.cevre = cevre;
    }

    public Daire() {
    }
}
