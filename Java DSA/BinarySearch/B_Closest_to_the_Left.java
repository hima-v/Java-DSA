import java.util.Scanner;

public class B_Closest_to_the_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            System.out.println(binsearch(arr, sc.nextInt()));
        }
        sc.close();
    }

    public static int binsearch(int[] arr, int target) {
        int low = -1;
        int high = arr.length;
        int mid = 0;
        while (high > low + 1) {
            mid = (high + low) / 2;
            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (low + 1);
    }
}