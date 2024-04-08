import java.util.Scanner;

public class B_Vlad_and_Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Size of the grid

            char[][] grid = new char[n][n];

            // Read the grid
            for (int i = 0; i < n; i++) {
                String row = scanner.next();
                grid[i] = row.toCharArray();
            }

            // Check for square
            boolean isSquare = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1' && (j == 0 || grid[i][j - 1] == '0')) {
                        isSquare = false;
                        break;
                    }
                }
            }

            // Check for triangle
            boolean isTriangle = true;
            outerloop: for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        if (j != n / 2 || grid[i - 1][j] != '1') {
                            isTriangle = false;
                            break outerloop;
                        }
                    }
                }
            }

            if (isSquare) {
                System.out.println("SQUARE");
            } else if (isTriangle) {
                System.out.println("TRIANGLE");
            }
        }

        scanner.close();
    }
}
