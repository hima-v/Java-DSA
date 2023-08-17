import java.util.Scanner;

public class B_Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String op = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                op += '0';
            } else {
                char nextch = str.charAt(i + 1);
                if (nextch == '.') {
                    op += '1';
                    i++;
                } else {
                    op += '2';
                    i++;
                }
            }
        }
        System.out.println(op);
        sc.close();
    }
}