import java.util.Scanner;

public class findfloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 5, 8, 12, 14, 20, 24, 26, 30, 32 };
        int ans = binsearch(24, arr);
        System.out.println(arr[ans]);
        sc.close();
    }

    public static int binsearch(int target, int[] arr) {
        int low = -1;
        int high = 10;
        int mid = 0;
        while (high > low + 1) {
            mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (low);
    }
}
