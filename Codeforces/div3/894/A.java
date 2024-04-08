import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = { 'v', 'i', 'k', 'a' };
        int t = sc.nextInt();
        int i = 0;
        for (i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char inp[][] = new char[n][m];
            int c = 0;
            int check = 0;
            for (int j = 0; j < n; j++) {
                String r = sc.next();
                for (int k = 0; k < m; k++) {
                    inp[j][k] = r.charAt(j);
                }
            }
            for (int j = 0; j < n; j++) {
                int flag = 0;
                for (int k = 0; k < m; k++) {
                    if (inp[j][k] == word[c]) {
                        c += 1;
                        flag = 1;
                        k = m;
                    }
                    if (flag == 1) {
                        check += 1;
                    }
                }
            }
            System.out.println(check);
            if ( >= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
