package functions;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ");
        int m = sc.nextInt();
        sc.close();
        System.out.println("Your grade is: " + grade(m));
    }

    static String grade(int m) {
        if (m > 90 && m <= 100) {
            return ("AA");
        }
        if (m > 80 && m <= 90) {
            return ("AB");
        }
        if (m > 70 && m <= 80) {
            return ("BB");
        }
        if (m > 60 && m <= 70) {
            return ("BC");
        }
        if (m > 50 && m <= 60) {
            return ("CC");
        }
        if (m > 40 && m <= 50) {
            return ("CD");
        } else {
            return ("FAIL");
        }
    }
}
