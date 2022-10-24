package hafta3uygulama4;
public class Metotlar {
    public static int Hesap(int sayi){
        int faktoriyel = 1;
        for(int i = 1; i <= sayi; ++i)
        {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
