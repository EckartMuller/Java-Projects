
import java.util.Scanner;

/**
 * ASCIICrypto
 */
public class ASCIICrypto {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String kelime, yeni = "";
        System.out.println("Word: ");
        kelime = scn.next();
        scn.close();
        for(int i = 0;i<kelime.length();i++)
        {
            yeni += (char)((int)kelime.charAt(i) + 15);
        }
        System.out.println(yeni);
    }
}