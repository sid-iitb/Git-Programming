/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_LONGESTINCREASINGSUBSEQUENCE {
    public static void main(String args[])
    {
        int a[]= { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        sequence(a);
    }
    static void sequence(int a[])
    {
        int table[]=new int[a.length];
        for(int i=0;i<a.length;i++)
            table[i]=1;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j] && table[i]<table[j]+1)
                {
                    table[i]=table[j]+1;
                }
            }
        }
        System.out.println(table[a.length-1]);
    }
}
