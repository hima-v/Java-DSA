import java.util.Scanner;

public class B_Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int i = 0;
        String str = sc.next();
        char[] stray = new char[n];
        for (i = 0; i < n; i++) {
            stray[i] = str.charAt(i);
        }
        for (i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (stray[j] == 'B' && stray[j + 1] == 'G') {
                    swap(j, stray);
                    j++;
                }
            }
        }
        String sf = "";
        for (i = 0; i < n; i++) {
            sf = sf + stray[i];
        }
        System.out.println(sf);
        sc.close();
    }

    public static void swap(int pos, char[] stray) {
        char ch = stray[pos];
        stray[pos] = stray[pos + 1];
        stray[pos + 1] = ch;
    }
}