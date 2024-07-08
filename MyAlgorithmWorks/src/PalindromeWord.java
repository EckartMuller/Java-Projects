import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String s = scn.next();
        scn.close();
        
        boolean durum = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                durum = false;
                break; 
            }
        }
        
        if (durum == true)
            System.out.println("Palindrome");
        else
            System.out.println("Non Palindrome");
    }
}
