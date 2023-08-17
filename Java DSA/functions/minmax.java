package functions;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("Maximum number is: " + maxfn(a, b, c));
    }

    static int maxfn(int a, int b, int c) {
        int maxi = a;
        if (a < b) {
            maxi = b;
            if (b < c) {
                maxi = c;
            }
        } else {
            if (a < c) {
                maxi = c;
            }
        }
        return (maxi);
    }
}
