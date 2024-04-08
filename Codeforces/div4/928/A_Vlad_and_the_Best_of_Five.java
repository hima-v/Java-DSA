import java.util.Scanner;

public class A_Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int inp = sc.nextInt();
        for (i = 0; i < inp; i++) {
            String st = sc.next();
            int a_f = 0;
            int b_f = 0;
            for (j = 0; j < 5; j++) {
                char ch = st.charAt(j);
                if (ch == 'A') {
                    a_f += 1;
                } else {
                    b_f += 1;
                }
            }
            if (a_f > b_f) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
