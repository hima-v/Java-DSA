import java.util.Scanner;

public class C_Non_coprime_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            int num = 0;
            for (int j = l; j <= r; j++) {
                num = j;
                int b = split(num);
                if (b != 0) {
                    ans = b;
                    j = r + 1;
                }
            }
            if (ans == 0) {
                System.out.println(-1);
            } else {
                System.out.println(ans + " " + (num - ans));
            }
        }
    }

    public static int split(int number) {
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return (i);
            }
        }
        return (0);
    }
}