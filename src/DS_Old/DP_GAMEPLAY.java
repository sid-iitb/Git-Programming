/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_GAMEPLAY {

    public static void main(String args[]) {
        int a[] = {5, 3, 7, 10,9};
        //System.out.println(recursion(a, 0, a.length - 1));
        dpVersion(a, a.length);
    }

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static int max(int a, int b) {
        return Math.max(a, b);
    }

    static int recursion(int a[], int i, int j) {
        if (i == j) {
            return a[i];
        }
        if (j == i + 1) {
            return max(a[i], a[j]);
        } else {
            return max(a[i] + min(recursion(a, i + 2, j), recursion(a, i + 1, j - 1)),
                    a[j] + min(recursion(a, i + 1, j - 1), recursion(a, i, j - 2)));
        }
    }

    static void dpVersion(int a[], int length) {
        int res[][] = new int[length][length];
        int x, y, z;
        for (int gap = 0; gap < length; gap++) {
            for (int i = 0, j = gap; j < length; j++, i++) {
                x = ((i + 2) <= j) ? res[i + 2][j] : 0;
                y = ((i + 1) <= (j - 1)) ? res[i + 1][j - 1] : 0;
                z = (i <= (j - 2)) ? res[i][j - 2] : 0;
                res[i][j] = max(a[i] + min(x, y), a[j] + min(y, z));
            }
        }
        System.out.println(res[0][length - 1]);
    }
}
