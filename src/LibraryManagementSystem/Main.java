/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.LinkedList;

/**
 *
 * @author sidhsaho
 */
public class Main {

    public static void main(String args[]) {
        System.out.println(numsOfWays("101101101"));
    }

    static int numsOfWays(String s) {
        long[] f = new long[s.length() + 1];
        f[0] = 0;
        for (int i = 1; i <= s.length(); ++i) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; ++j) {
                if (s.charAt(j - 1) == '0') {
                    continue;
                }
                long num = Long.parseLong(s.substring(j - 1, i), 2);
                if (isPower(num)) {
                    f[i] = Math.min(f[i], f[j - 1] + 1);
                }
            }
        }
        return f[s.length()] == Integer.MAX_VALUE ? -1 : (int) f[s.length()];
    }

    static boolean isPower(long val) {
        if (val == 0) {
            return false;
        }
        int n = (int) (Math.log(val) / Math.log(5));
        return Math.pow(5, n) == val;
    }
}
