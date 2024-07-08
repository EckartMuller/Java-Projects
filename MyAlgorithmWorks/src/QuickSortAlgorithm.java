
import java.util.Arrays;

public class QuickSortAlgorithm {

    public static void QuickSort(int dizi[], int baslangic, int bitis) {
        if (baslangic < bitis) {
            int q = Parcala(dizi, baslangic, bitis);
            QuickSort(dizi, baslangic, q - 1);
            QuickSort(dizi, q + 1, bitis);
        }
    }

    public static int Parcala(int[] dizi, int baslangic, int bitis) {
        int x = dizi[bitis];
        int i = baslangic - 1;

        for (int j = baslangic; j < bitis; j++) {
            if (dizi[j] <= x) {
                i = i + 1;

                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
           }
        
        }

        int temp2 = dizi[i+1];
        dizi[i+1] = dizi[bitis];
        dizi[bitis] = temp2;

        return i + 1;
    }

    public static void main(String[] args) {
        int dizi[] = {7, 8, 5, 2, 4, 6, 3};

        QuickSort(dizi, 0, dizi.length - 1);

        System.out.println(Arrays.toString(dizi));

    }
}
