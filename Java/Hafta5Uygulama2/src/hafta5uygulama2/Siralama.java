package hafta5uygulama2;
public class Siralama {
    double buyukSirala(double sayi1, double sayi2, double sayi3){
        if(sayi1 > sayi2 && sayi1 > sayi3)
            return sayi1;
        else if(sayi2 > sayi1 && sayi2 > sayi3)
            return sayi2;
        else
            return sayi3;
    }
    
    double kucukSirala(double sayi1, double sayi2, double sayi3){
        if ((sayi1 < sayi2) && (sayi1 < sayi3))
            return sayi1;
        else if(sayi2 < sayi3)
            return sayi2;
        else
            return sayi3;
    }
    
    double ortancaSirala(double sayi1, double sayi2, double sayi3){
        if((sayi1 > sayi2) && (sayi1 < sayi3) || (sayi1 > sayi3) && (sayi1 < sayi2))
            return sayi1;
        else if((sayi2 > sayi1) && (sayi2 < sayi3) || (sayi2 > sayi3) && (sayi2 < sayi1))
            return sayi2;
        else 
            return sayi3;
    }
}
