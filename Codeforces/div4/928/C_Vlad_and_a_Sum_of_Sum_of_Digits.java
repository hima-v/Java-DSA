import java.util.Scanner;

public class C_Vlad_and_a_Sum_of_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Largest number Vladislav writes

            // Calculate the number of complete cycles of 1 to 9
            int completeCycles = (n - 1) / 9;

            // Calculate the remaining digits after the last complete cycle
            int remainingDigits = n - 9 * completeCycles;

            // Calculate the sum of digits for the complete cycles
            int sumCompleteCycles = 45 * completeCycles;

            // Calculate the sum of digits for the remaining numbers
            int sumRemainingDigits = 0;
            for (int i = 1; i <= remainingDigits; i++) {
                sumRemainingDigits += i % 10;
            }

            // Calculate the total sum
            int totalSum = sumCompleteCycles + sumRemainingDigits;

            System.out.println(totalSum);
        }

        scanner.close();
    }
}
