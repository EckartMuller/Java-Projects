
public class InsertionSortAlgorithm {

    public static void main(String[] args) {
        int dizi[] = {7, 8, 5, 2, 4, 6, 3};

        for (int i = 1; i < dizi.length; i++) {
            int j = i;

            while(j > 0 && dizi[j - 1] > dizi[j])
            {
                int temp = dizi[j];
                dizi[j] = dizi[j - 1];
                dizi[j - 1] = temp;
                j--;
            }
        }

        for(int i = 0;i < dizi.length;i++){
            System.out.print(dizi[i] + " ");
        }
    }
}
