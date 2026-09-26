import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int[] a = new int[p];

        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] b = new int[q];

        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        while (i < p && j < q) {
            if (a[i] <= b[j]) {
                System.out.print(a[i++] + " ");
            } else {
                System.out.print(b[j++] + " ");
            }
        }

        while (i < p) {
            System.out.print(a[i++] + " ");
        }

        while (j < q) {
            System.out.print(b[j++] + " ");
        }
    }
}