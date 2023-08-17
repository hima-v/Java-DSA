package functions;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check if its prime or not ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
