public class closetotarget2 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'h', 'o', 'z' };
        char target = 'i';
        int low = -1;
        int high = letters.length;
        int mid = 0;
        while (high > low + 1) {
            mid = (high + low) / 2;
            if (binsearch(mid, letters, target)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        if (high == letters.length) {
            System.out.println(letters[0]);
        } else {
            System.out.println(letters[high]);
        }
    }

    public static boolean binsearch(int pos, char[] arr, char target) {
        return (arr[pos] > target);
    }
}
