import java.util.Scanner;

public class CreateMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kare Matris (NxN): ");
        int T = 0;
        int N = scn.nextInt();
        int[][] matris = new int[N][N];
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                System.out.print((i+1) + ".satir - " + (j+1) + ". sütun: ");
                matris[i][j] = scn.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.println("Matrix: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0;i <N;i++)
            for(int j = 0; j < N;j++)
                T+=matris[i][j];

        System.out.println("Toplam: " + T);
    }
}
