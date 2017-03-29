/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class KSubsequnce {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 1};
        System.out.println(kSub(5, nums));
    }

    static long kSub(int k, int[] nums) {
        int sum[] = new int[k];
        sum[0] = 1;
        int psum = 0;
        for (int i = 0; i < nums.length; i++) {
            psum += nums[i];
            psum %= k;
            sum[psum]++;
        }
        long ret = 0;
        for (int i = 0; i < k; i++) {
            ret += (long) sum[i] * (sum[i] - 1) / 2;
        }
        return ret;

    }

}
