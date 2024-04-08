import java.util.Scanner;

public class A_Prime_Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int el1 = 0;
            int el3 = 0;
            // String str = Integer.toString(n);
            for (int j = 0; j < 9; j++) {
                int el = n % 10;
                if (el == 1) {
                    el1 = j;
                } else if (el == 3) {
                    el3 = j;
                }
                n = n / 10;
            }
            if (el1 < el3) {
                System.out.println(31);
            } else {
                System.out.println(13);
            }
        }
    }
}