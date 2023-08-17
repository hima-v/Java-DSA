package Algos;

import java.util.Arrays;

public class linearsearchmultidim {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 5 }, { 31, 17, 19 }, { 14, 10, 24 } };
        int target = 14;
        int[] ans = linearsearch(arr, target);
        System.out.println("The position is: " + Arrays.toString(ans));
    }

    static int[] linearsearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
