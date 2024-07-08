
import java.util.Random;
import java.util.Scanner;

public class ProbabilityGame {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hak = 5, n = new Random().nextInt(20), sayi = 0;
        do {
            System.out.println("\n" + hak + " hakkınız kaldı.Sayı gir: ");
            sayi = scn.nextInt();
            if (n > sayi) {
                System.out.println("Sayıyı yukselt");
                hak--;
            } else if (n < sayi) {
                System.out.println("Sayıyı kücült");
                hak--;
            } else {
                System.out.println("aferin la");
                break;
            }
            if (hak < 0) {
                System.out.println("\nKaybettin\n");
            }

        } while (hak > 0);
    }
}
