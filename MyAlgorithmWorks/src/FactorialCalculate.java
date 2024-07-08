import java.util.Scanner;

public class FactorialCalculate {

    static int Faktoriyel(int sayi){
        int sonuc = 1;
        for(int i = 1;i<=sayi;i++){
            sonuc *= i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi;
        System.out.println("Enter number: ");
        sayi = scn.nextInt();
        System.out.println(Faktoriyel(sayi));
    }
}
