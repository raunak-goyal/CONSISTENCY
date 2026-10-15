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

        boolean identity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    identity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) {
                    identity = false;
                    break;
                }
            }

            if (!identity) {
                break;
            }
        }

        System.out.println(identity ? "Identity Matrix" : "Not Identity Matrix");
    }
}