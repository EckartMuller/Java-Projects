import java.util.Scanner;

public class IdentityMatris {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kare Matris (NxN): ");
        int N = scn.nextInt();
        int[][] matris = new int[N][N];
        for(int i = 0;i < N; i++){

            for(int j = 0; j < N;j++){
                if(i == j)
                    matris[i][j] = 1;
                else
                    matris[i][j] = 0;
            }
            

        }
        for(int i = 0;i < N;i++)
            {
                for(int j = 0;j < N;j++)
                    System.out.print("  "+"\u001B[32m"+matris[i][j]);
                System.out.print("\n");
            }

            
    }
}
