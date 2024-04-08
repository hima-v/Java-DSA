import java.util.Scanner;

public class A_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (PrimeNo(n)) {
                System.out.println(n);
            } else {
                for (int j = 10000000; j > 100; j = j / 10) {
                    int num = n / j;
                    if (PrimeNo(num)) {
                        System.out.println(num);
                        j = 1;
                    } else {
                        String nums = Integer.toString(j);
                        for (int k = nums.length(); k > 1; k--) {
                            String res = nums.substring(0, k) + nums.substring(k + 1);
                            int checknum = Integer.valueOf(res);
                            if (PrimeNo(checknum)) {
                                System.out.println(checknum);
                                j = 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean PrimeNo(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
