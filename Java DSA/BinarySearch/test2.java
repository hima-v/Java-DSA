import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter");
                arr[i][j] = sc.nextInt();
            }
        }
        int balloon = binsearch(26, arr[0]);
        System.out.println(balloon);
        sc.close();
    }

    public static int binsearch(int T, int[] arr) {
        int t = arr[0];
        int z = arr[1];
        int y = arr[2];
        int balloon_count = 0;
        for (int i = 0; i < T; i += t) {
            balloon_count += 1;
            if (balloon_count % z == 0) {
                // System.out.println("executed");
                i += y;
            }
        }
        return (balloon_count);
    }
}
