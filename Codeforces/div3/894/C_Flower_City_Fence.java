import java.util.Scanner;

public class C_Flower_City_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] inp_a = new int[n];
            for (int j = 0; j < n; j++) {
                inp_a[j] = sc.nextInt();
            }
            if (inp_a[0] == n) {
                int[] h_fence = new int[inp_a[0]];
                for (int j = 0; j < inp_a[0]; j++) {
                    for (int k = 0; k < n; k++) {
                        if (inp_a[k] >= j + 1) {
                            h_fence[j] += 1;
                        }
                    }
                }
                int f = 0;
                for (int j = 0; j < n; j++) {
                    if (h_fence[j] == inp_a[j]) {
                        f += 1;
                    }
                }
                if (f == n) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}