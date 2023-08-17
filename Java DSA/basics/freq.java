package basics;

import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        long n = sc.nextLong();
        System.out.println("Enter the number whose occurence must be found");
        int num = sc.nextInt();
        long i, c = 0;
        while (n > 0) {
            i = (n % 10);
            if (i == num) {
                c += 1;
            }
            n = n / 10;
        }
        System.out.println("The number of times the digit " + num + " appeared is: " + c);
        sc.close();
    }
}
