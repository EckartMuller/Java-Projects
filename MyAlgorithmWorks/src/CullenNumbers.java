
public class CullenNumbers {

    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            long cullen = (long) (n * Math.pow(2, n) + 1);
            System.out.println("n=" + n + "\t" + cullen);
            int kontrol = 0;
            for (long i = 1; i <= cullen; i++) {
                if (cullen % i == 0) {
                    kontrol++;
                }
            }

            if (kontrol == 2) {
                System.out.println("\t\tAsal\n"); 
            }else {
                System.out.println();
            }
        }

    }
}
