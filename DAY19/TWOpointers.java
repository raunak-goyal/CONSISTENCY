import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("At least two elements required");
            return;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        long closestSum = Long.MAX_VALUE;
        int first = 0, second = 0;

        while (left < right) {
            long sum = (long) arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                first = arr[left];
                second = arr[right];
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println(first + " " + second);
    }
}