import java.util.Scanner;

public class C_Very_Easy_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long low = 0;
        long high = 1;
        long mid = 0;
        long ans = 0;
        while (binsearch(high, n, x, y) == false) {
            high *= 2;
        }
        while (low <= high) {
            mid = (low + high) / 2;
            if (binsearch(mid, n, x, y)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static boolean binsearch(long time, long given_copies, long x, long y) {
        long cal_time = Math.min(x, y);
        time = time - cal_time;
        if (time < 0) {
            return false;
        }
        long cal_copies = 1;
        cal_copies += (time / x) + (time / y);
        return (cal_copies >= given_copies);
    }
}