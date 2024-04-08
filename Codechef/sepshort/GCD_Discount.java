import java.util.Scanner;

public class GCD_Discount {
    public static long calculateGCD(long[] numbers) {
        long gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }

        return gcd;
    }

    public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] mrp = new long[n];
            long[] offer = new long[n];
            for (int j = 0; j < n; j++) {
                mrp[j] = sc.nextLong();
            }
            for (int j = 0; j < n; j++) {
                offer[j] = sc.nextLong();
            }
            long answer = calculateGCD(mrp);
            for (int h = 0; h < n; h++) {
                long og = mrp[h];
                mrp[h] = offer[h];
                long result = calculateGCD(mrp);
                if (answer < result) {
                    answer = result;
                }
                mrp[h] = og;
            }
            System.out.println(answer);
        }
    }
}