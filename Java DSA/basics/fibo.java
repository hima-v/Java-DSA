package basics;

import java.util.Scanner;;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position for the fibonacci sequence");
        int n = sc.nextInt();
        sc.close();
        int i;
        int p = 0;
        int q = 1;
        for (i = 2; i <= n; i++) {
            int temp = q;
            q = p + q;
            p = temp;
        }
        System.out.println(q);
    }
}
