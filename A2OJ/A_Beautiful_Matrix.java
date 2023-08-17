import java.util.Scanner;
import java.lang.Math;

public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int row = 0;
        int col = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    col = j;
                    row = i;
                }
            }
        }
        int steps = Math.abs(2 - row) + Math.abs(2 - col);
        System.out.println(steps);
    }
}