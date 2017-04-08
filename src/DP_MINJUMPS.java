/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_MINJUMPS {

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        recursion(arr, 0, arr.length);
    }

    static int recursion(int arr[], int l, int h) {
        if(l==h)
            return 0;
        if(arr[l]==0)
            return Integer.MAX_VALUE;
        for(int i=l;i<h;i++)
        {
            //for(int j=)
        }
        return 0;
    }
}
