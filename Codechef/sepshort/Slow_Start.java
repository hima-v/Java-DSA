import java.util.Scanner;

public class Slow_Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int h = sc.nextInt();
            int k = 5;
            int moves = 0;
            while (h > 0) {
                if (k > 0) {
                    h = h - x / 2;
                    k--;
                } else {
                    h = h - x;
                }
                moves++;
            }
            System.out.println(moves);
        }
    }
}