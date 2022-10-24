package hafta3uygulama3;
public class Sinif {
   public void Hesap(int sayi1)
    {
       int i;
       for(i = 1; i <= sayi1; i++)
           if(sayi1 % i == 0)
               System.out.println(i);
    }
}
