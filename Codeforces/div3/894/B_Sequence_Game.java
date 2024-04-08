import java.util.Scanner;
import java.util.ArrayList;

public class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int b_l = sc.nextInt();
            int[] b = new int[b_l];
            for (int j = 0; j < b_l; j++) {
                b[j] = sc.nextInt();
            }
            ArrayList<Integer> a = new ArrayList<>(b_l);
            a.add(b[0]);
            for (int j = 1; j < b_l; j++) {
                if (b[j] >= b[j - 1]) {
                    a.add(b[j]);
                } else {
                    a.add(b[j]);
                    a.add(b[j]);
                }
            }
            System.out.println(a.size());
            for (int j = 0; j < a.size(); j++) {
                System.out.print(a.get(j) + " ");
            }
        }
    }
}