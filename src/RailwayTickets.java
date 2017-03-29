
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RailwayTickets {

    public static void main(String[] args) {
        int n = 0, m;
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        int a[] = new int[inputString.length];
        n = Integer.parseInt(inputString[0]);
        m = Integer.parseInt(inputString[1]);

        inputString = scanner.nextLine().split(" ");
        for (int i = 0; i < inputString.length; i++) {
            a[i] = Integer.parseInt(inputString[i]);
        }
        Arrays.sort(a);
        long res = 0;
        for (int i = n - 1; i >= 0; i--) {
            int te = n - i;
            int p = i > 0 ? a[i - 1] : 0;
            long t = Math.min((long) te * (a[i] - p), (long) m);
            long e = t / te;
            res += (2 * a[i] - e + 1) * e / 2 * te;
            res += (t % te) * (a[i] - e);
            m -= t;
            if (m == 0) {
                break;
            }
        }
        System.out.println(res);
    }
}
