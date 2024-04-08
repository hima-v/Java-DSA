import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int num_enemies = sc.nextInt();
            int health = sc.nextInt();
            int[] e_st = new int[num_enemies];
            for (int j = 0; j < num_enemies; j++) {
                e_st[j] = sc.nextInt();
            }
            int x = 0;
            int ans = 0;
            while (true) {
                if (!check(num_enemies, health, e_st, x)) {
                    x++;
                } else {
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean check(int N, int H, int[] en_health, int X) {
        for (int k = 0; k < N; k++) {
            if (en_health[k] > X) {
                if (H > en_health[k]) {
                    H = H - en_health[k];
                } else {
                    return (false);
                }
            }
        }
        if (H > 0) {
            return (true);
        } else {
            return (false);
        }
    }
}