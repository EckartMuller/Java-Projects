import  java.util.Random;

public class SayisalLoto {

    public static void main(String[] args) {
        int i = 0, j = 0;
        int loto[] = new int[6];
        while (i < 6) {
            int n = new Random().nextInt(999999999);
            for(j = 0;j < 6;j++){
                if(loto[j] == n)
                    break;
            }
            if(j == 6){
                loto[i] = n;
                i++;
            }
        }
        for(i = 0;i<6;i++)
            System.out.println("\t"+loto[i]);
    }
}
