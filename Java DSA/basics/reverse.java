package basics;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse: ");
        int n = sc.nextInt();
        int num = 0, i = 0;
        while (n > 0) {
            i = n % 10;
            num = (num * 10 + i);
            n = n / 10;
        }
        System.out.println("The  number in reverse is: " + num);
        sc.close();
    }
}
