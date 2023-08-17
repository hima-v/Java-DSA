import java.util.Scanner;

public class B_Ropes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double k = sc.nextDouble();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double low = 0;
        double high = 1e8;
        double mid = 0;
        for (int i = 0; i < 100; i++) {
            mid = (low + high) / 2;
            if (binsearch(mid, k, arr)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println(low);
        sc.close();
    }

    public static boolean binsearch(double rope_length, double given_k, double[] arr) {
        double cal_k = 0;
        double pieces = 0;
        for (int i = 0; i < arr.length; i++) {
            pieces = Math.floor(arr[i] / rope_length);
            cal_k += pieces;
        }
        return (cal_k >= given_k);
    }
}