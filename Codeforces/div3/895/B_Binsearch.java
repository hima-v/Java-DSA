import java.util.Scanner;

public class B_Binsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int no_traps = sc.nextInt();
            int[][] info = new int[no_traps][2];
            for (int j = 0; j < no_traps; j++) {
                info[j][0] = sc.nextInt();
                info[j][1] = sc.nextInt();
            }
            long low = 1;
            long high = 10;
            long mid = 0;
            long ans = 1;
            // while to set high
            while (high > low + 1) {
                mid = low + (high - low) / 2;
                if (binsearch(info, mid)) {
                    low = mid;
                    ans = low;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }

    public boolean binserach(int[][] traps, int room_no) {

    }
}
