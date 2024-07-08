import java.math.BigInteger;

public class FermatNumbers {
    public static void main(String[] args) {
        for (int n = 0; n <= 211; n++) {
            BigInteger exponent = BigInteger.valueOf((long) Math.pow(2, n));
            BigInteger fermat = BigInteger.valueOf(2).pow(exponent.intValue()).add(BigInteger.ONE);
            System.out.println(fermat + " __");
        }
    }
}
