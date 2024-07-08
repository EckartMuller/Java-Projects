import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.println("Bir sayı giriniz: ");
        sayi = scn.nextInt();
        scn.close();
        while(sayi!=0)
        {
            toplam+=sayi%10;
            sayi /= 10;
        }
        System.out.println("Toplam: " + toplam);
    }
}
