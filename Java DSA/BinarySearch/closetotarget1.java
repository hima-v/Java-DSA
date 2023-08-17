public class closetotarget1 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'h', 'o', 'z' };
        char target = 'i';
        int low = 0;
        int high = letters.length - 1;
        int mid = 0;
        while (high >= low) {
            mid = (high + low) / 2;
            if (binsearch(mid, letters, target)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(letters[low % letters.length]);
    }

    public static boolean binsearch(int pos, char[] arr, char target) {
        return (arr[pos] > target);
    }
}
