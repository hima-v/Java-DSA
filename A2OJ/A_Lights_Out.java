import java.util.Scanner;

public class A_Lights_Out {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] oparr = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] % 2 != 0) {
                    setval(i, j, oparr);
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(oparr[i][j]);
            }
            System.out.println();
        }
    }

    public static void setval(int row, int col, int[][] oparr) {
        int i = 0;
        int j = 0;
        for (i = 0; i < 3; i++) {
            oparr[row][i] = oparr[row][i] ^ 1;
        }
        for (j = 0; j < 3; j++) {
            oparr[j][col] = oparr[j][col] ^ 1;
        }
    }
}