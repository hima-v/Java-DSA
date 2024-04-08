import java.util.Scanner;

public class Work_Smarter_Not_Harder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int L = sc.nextInt();
            double tort = sc.nextDouble();
            double hare = sc.nextDouble();
            double v1 = Math.ceil(L / tort);
            double v2 = Math.ceil(L / hare);
            if (v1 == v2) {
                System.out.println(-1);
            } else {
                double diff = v1 - v2 - 1;
                System.out.println((int) diff);
            }
        }
    }
}