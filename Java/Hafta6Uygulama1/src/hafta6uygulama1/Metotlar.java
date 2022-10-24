package hafta6uygulama1;
class Metotlar {
    double en;
    double boy;
    double yukseklik;
    
    public Metotlar(double en, double boy, double yukseklik){
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }
    
    public double hacim(){
        return en * boy * yukseklik;
    }
}
