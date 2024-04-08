import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int a1 = arr[0];
            int y1 = func(a1, n);
            int y2 = -(n / arr[0]) * x + n;
        }
    }

    public static int func(int a1, int n) {
        return (n * a1 / (a1 + n));
    }

    public static int func2(int a1, int n) {
        return (n * a1 / (a1 + n));
    }
}
