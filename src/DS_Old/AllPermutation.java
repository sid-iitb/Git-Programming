/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class AllPermutation {
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        Permutation(a, 0, a.length);
    }
    static void Permutation(int a[],int k,int n)
    {
        if(k==n)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]);
            }
            System.out.println("");
        }
        else
        {
            for(int i=k;i<a.length;i++)
            {
                int t=a[i];
                a[i]=a[k];
                a[k]=t;
                Permutation(a, i+1, n);
                int t1=a[i];
                a[i]=a[k];
                a[k]=t1;
            }
        }
                
    }
}
