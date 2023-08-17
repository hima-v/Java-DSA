// smallest number that is greater than or equal to the numbers in array.
// thus we are looking for the smallest number which will satisfy the condition
// given number<= a number from the array
// CEIL OF A NUMBER

public class findceil {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 14, 16, 20, 21, 24, 29, 33, 36, 49 };
        int ans1 = ceilval1(arr, 34); // suppose the input number is 15
        int ans2 = ceilval2(arr, 34);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int ceilval1(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] < n) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return (arr[low]);
    }

    static int ceilval2(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[high];
    }
}
