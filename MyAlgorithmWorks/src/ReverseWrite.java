import java.util.Scanner;

public class ReverseWrite {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi;
        System.out.println("Enter number: ");
        sayi = scn.nextInt();
        scn.close();
        while(sayi!=0){
            System.out.print(sayi%10);
            sayi/=10;
        }
    }
}
