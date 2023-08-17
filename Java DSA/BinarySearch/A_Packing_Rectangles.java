import java.util.Scanner;

public class A_Packing_Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long n = sc.nextLong();
        long low = 0;
        long mid = 0;
        long high = 1;
        while (binsearch(high, n, w, h) == false) {
            high *= 2;
        }
        while (high > low + 1) {
            mid = (high + low) / 2;
            if (binsearch(mid, n, w, h)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println(high);
        sc.close();
    }

    public static boolean binsearch(long side, long given_n, long w, long h) {
        long cal_n = (side / w) * (side / h);
        return (cal_n >= given_n);
    }
}