package basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while (true) {
            System.out.println("Enter the operator you want to perform or press x to exit");
            char ch = sc.next().charAt(0);
            sc.close();
            if (ch == '*' || ch == '+' || ch == '-' || ch == '/' || ch == '%') {
                System.out.println("Enter the operands");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '/') {
                    ans = a / b;
                }
                if (ch == '%') {
                    ans = a % b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                System.out.println("The out put is: " + ans);
            } else if (ch == 'x') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
        }
    }
}
