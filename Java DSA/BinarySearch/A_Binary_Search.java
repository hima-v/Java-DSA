import java.util.Scanner;

public class A_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < k; j++) {
            System.out.println(binsearch(arr, sc.nextInt()));
        }
        sc.close();
    }

    public static String binsearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (target == arr[mid]) {
                return "YES";
            }
        }
        return "NO";
    }
}