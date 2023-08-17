import java.util.Scanner;
import java.util.Arrays;

public class D_Fast_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int LB = closestright(arr, sc.nextInt());
            int UB = closestleft(arr, sc.nextInt());
            int ans = UB - LB + 1;
            System.out.print(ans + " ");
        }
        sc.close();
    }

    public static int closestright(int[] arr, int bound) {
        int low = -1;
        int high = arr.length;
        int mid = 0;
        while (high > low + 1) {
            mid = (low + high) / 2;
            if (arr[mid] < bound) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (low + 1);
    }

    public static int closestleft(int[] arr, int bound) {
        int low = -1;
        int high = arr.length;
        int mid = 0;
        while (high > low + 1) {
            mid = (low + high) / 2;
            if (arr[mid] > bound) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (high - 1);
    }
}