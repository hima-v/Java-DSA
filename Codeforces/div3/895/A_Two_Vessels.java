import java.util.Scanner;

public class A_Two_Vessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int k = 0;
            while (max > min) {
                max = max - c;
                min = min + c;
                k++;
            }
            System.out.println(k);
        }
    }
}