/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

/**
 *
 * @author sidhsaho
 */
public class Segregate {
    public static void main(String args[])
    {
        int a[]={0, 1, 0, 1, 1, 1};
        a=segregate(a);
        printArray.print(a);
    }
    static int[] segregate(int a[])
    {
        int l=0,r=a.length-1;
        while(l<r)
        {
            while(a[l]==0 && l<r)
                l++;
            while(a[r]==1 && l<r)
                r--;
            if(l<r)
            {
                a[l]=0;
                a[r]=1;
                l++;
                r--;
            }
        }
        return a;
    }
}
