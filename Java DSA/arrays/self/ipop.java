package arrays.self;

import java.util.Scanner;

public class ipop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
