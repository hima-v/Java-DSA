import java.util.Scanner;

public class A_Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = -1;
        int n = sc.nextInt();
        int i = n;
        while (ans < 0) {
            i++;
            if (check(i)) {
                ans = i;
                System.out.println(i);
            }
        }
    }

    public static boolean check(int year) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int j = 0; j < 4; j++) {
            int num = year % 2;
            if (arr[num] == 0) {
                arr[num] = 1;
            } else {
                return false;
            }
        }
        return true;
    }
}