import java.util.Scanner;

public class A_Gift_Carpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] inp = new char[n][m];
            for (int j = 0; j < n; j++) {
                String st = sc.next();
                for (int k = 0; k < m; k++) {
                    inp[j][k] = st.charAt(k);
                }
            }
            int c = 0;
            char[] word = { 'v', 'i', 'k', 'a' };
            for (int j = 0; j < m; j++) {
                int flag = 0;
                for (int k = 0; k < n; k++) {
                    if (inp[k][j] == word[c]) {
                        flag = 1;
                        k = n;
                    }
                }
                if (flag == 1) {
                    c += 1;
                    if (c == 4) {
                        break;
                    }
                }
            }
            if (c == 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}