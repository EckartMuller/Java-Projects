import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int sayi, t = 0;
            System.out.println("Bir sayı giriniz: ");
            sayi = scn.nextInt();

            for(int i = 1;i<=sayi;i++)
            {
                if(sayi%i == 0)
                    t++;
                
            }
            if(t == 2)
                System.out.println("Asal sayıdır");
            else
                System.out.println("Asal değil");
        }
}
