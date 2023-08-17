import java.util.Scanner;

public class D_Children_Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] values = new int[n][3];
        int[] balloon_counts = new int[n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < 3; c++) {
                values[r][c] = sc.nextInt();
            }
        }
        int time_ans = 0;
        int[] arr_ans = new int[n];
        int low = 0;
        int high = 15000;
        int mid = 0;
        int cal_count = 0;
        while (high > low + 1) {
            mid = (low + high) / 2;
            for (int i = 0; i < n; i++) {
                int t = values[i][0];
                int z = values[i][1];
                int y = values[i][2];
                int balloons = 0;
                for (int j = 0; j <= mid; j += t) {
                    balloons += 1;
                    if (balloons % z == 0) {
                        j += y;
                    }
                }
                balloon_counts[i] = balloons;
                cal_count += balloon_counts[i];
            }
            if (cal_count >= m) {
                time_ans = mid;
                for (int k = 0; k < n; k++) {
                    arr_ans[k] = balloon_counts[k];
                }
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println(time_ans);
        for (int i = 0; i < n; i++) {
            System.out.print(arr_ans[i] + " ");
        }
        sc.close();
    }

    // public static int binsearch(int time, int[] info) {
    // int t = info[0];
    // int z = info[1];
    // int y = info[2];
    // int balloons = 0;
    // for (int j = 0; j <= time; j += t) {
    // balloons += 1;
    // if (balloons % z == 0) {
    // j += y;
    // }
    // }
    // return (balloons);
    // }
}