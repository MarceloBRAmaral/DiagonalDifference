import java.util.Scanner;
import static java.lang.Math.abs;

public class DiagonalDifference {

    public static void main(String[] args) {

        int diag1 = 0;
        int diag2 = 0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = input.nextInt();
                if(i==j){diag1 += matrix[i][j];}
                if(i+j==n-1){diag2 += matrix[i][j];}
            }
        }

        System.out.print(abs(diag1-diag2));
    }
}
