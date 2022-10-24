package hafta3uygulama2;
public class Hesap {
    static double toplama(double sayi1, double sayi2){
        return sayi1 + sayi2;
    }
    static double cikarma(double sayi1, double sayi2){
        if(sayi1 > sayi2)
            return sayi1 - sayi2;
        else
            return sayi2 - sayi1;
    }
    static double carpma(double sayi1, double sayi2){
        return sayi1 * sayi2;
    }
    static double bolme(double sayi1, double sayi2){
        if(sayi1 > sayi2)
            return (sayi1 / sayi2);
        else
            return (sayi2 / sayi1);
    }
    
}
