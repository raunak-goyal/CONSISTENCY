import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int comparisons = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            comparisons++;

            if (arr[i] == k) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + comparisons);
    }
}