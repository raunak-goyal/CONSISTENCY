
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Long, Integer> freq = new HashMap<>();
        freq.put(0L, 1);

        long sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            count += freq.getOrDefault(sum, 0);
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
        sc.close();
    }
}
