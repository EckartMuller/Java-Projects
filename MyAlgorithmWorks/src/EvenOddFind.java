import java.util.Arrays;
import java.util.Random;

public class EvenOddFind {
    Random rnd = new Random();
    int dizi[];
    void Rastgele(int uzunluk){
        dizi = new int[uzunluk];
        for(int i = 0;i<uzunluk;i++){
            dizi[i] = rnd.nextInt(99)+1;
        }
        System.out.println(Arrays.toString(dizi));
    }

    void EvenOddCount(){
        int tek = 0, cift = 0;
        for(int i = 0;i< dizi.length;i++){
            if(dizi[i] %2 == 0)
                cift++;
            else
                tek++;
        }
        System.out.println("Tek: " + tek + " Çift:" + cift);
    }
    public static void main(String[] args) {
        //odd tek even çift
        EvenOddFind list1 = new EvenOddFind();
        list1.Rastgele(5);
        list1.EvenOddCount();


    }
    }
