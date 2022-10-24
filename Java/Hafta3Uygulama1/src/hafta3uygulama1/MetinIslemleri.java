package hafta3uygulama1;
public class MetinIslemleri {
    public static void birlestir(String isim, String soyIsim){
        System.out.println("İsim Soyisim: " + isim + " " + soyIsim);
    }
    public static void uzunlukBul(String isim, String soyIsim){
        int isimUzunluk = isim.length();
        int soyIsimUzunluk = soyIsim.length();
        System.out.println("Karakter Sayısı: " + (isimUzunluk + soyIsimUzunluk));
    }
}
