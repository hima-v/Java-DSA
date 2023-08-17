package arrays.self;

import java.util.*;
import java.util.Arrays;

public class swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 23, 54, 78, 40 };
        System.out.println("Enter the index for which you want to swap: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
