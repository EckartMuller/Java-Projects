
import java.util.Random;

public class MinMaxValueList {
    public static void main(String[] args) throws Exception {
        final int dizi[] = new int[10];
        Random rand = new Random();
        for(int i = 0;i<dizi.length;i++)
        {
            dizi[i] = rand.nextInt(1000);
        }
        int kucuk = dizi[0], buyuk = dizi[0];
        for(int i = 0;i<dizi.length;i++)
        {
            if(dizi[i]<kucuk)
                kucuk = dizi[i];
            else if(dizi[i]>buyuk)
                buyuk = dizi[i];
        }

        System.out.println("Min: " + kucuk);
        System.out.println("Max: " + buyuk);
        
    }
}
