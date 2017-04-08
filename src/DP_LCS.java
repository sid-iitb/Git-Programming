/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_LCS {

    public static void main(String args[]) {
        String a = "ABCDGH";
        String b = "AEDFHR";
        char X[] = a.toCharArray();
        char Y[] = b.toCharArray();
        //System.out.println(X[X.length-1]);
        //System.out.println(recursion(X, X.length, Y, Y.length));
        dp_sol(X, X.length, Y, Y.length);
    }

    static int recursion(char X[], int m, char Y[], int n) {
        //System.out.println(m+"dude"+n);
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X[m - 1] == Y[n - 1]) {
            return 1 + recursion(X, m - 1, Y, n - 1);
        } else {
            return Math.max(recursion(X, m, Y, n - 1), recursion(X, m - 1, Y, n));
        }
    }

    static void dp_sol(char X[], int m, char Y[], int n) {
        int table[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                }
               // if (i > 0 && j > 0) {

                   else if (X[i - 1] == Y[j - 1]) {
                        table[i][j] = 1 + table[i - 1][j - 1];
                    } else {
                        table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                    }
              //  }
            }
        }
        System.out.println(table[m][n]);
    }
}
