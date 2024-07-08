import java.util.Scanner;

public class PermutationCalculate {
    protected void Permutation(String per){
        int first_index = per.indexOf("(") + 1;
        int last_index = per.indexOf(")");
        String data = per.substring(first_index, last_index);
        String[] parcalar = data.split(",");
        System.out.println(parcalar[0] + " " + parcalar[1]);
        int n = Integer.parseInt(parcalar[0].trim());
        int r = Integer.parseInt(parcalar[1].trim());
        int ust_fac = 1;
        int asagi_fac = 1;
        for(int i = 1;i<=n;i++){
            ust_fac *= i;
        }
        for(int i = 1;i<= (n-r);i++){
            asagi_fac *= i;
        }
        System.out.println(ust_fac / asagi_fac);
    }
    public static void main(String[] args) {
        PermutationCalculate number1 = new PermutationCalculate();
        String veri;
        System.out.println("Enter Pemrutation P(n,r)");
        Scanner scn = new Scanner(System.in);
        veri = scn.nextLine();
        number1.Permutation(veri);
    }
}
