import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - 1 - i];
        }

        // Subtract the center element if n is odd
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.println(sum);
    }
}