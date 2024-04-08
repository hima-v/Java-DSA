import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String op = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                op = op + 0;
            } else {
                op = op + 1;
            }
        }
        System.out.println(op);
    }
}