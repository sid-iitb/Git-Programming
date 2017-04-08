package List_Old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class AllPermutations {
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        //String s[]=buf.readLine().split("");
        //int n=s.length;
        int a[]={1,2,3};
        Permutation(a,0,a.length-1);
    }
    static void Permutation(int a[],int k,int n)
    {
        /*if(a.length==0)
        {
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);
        }*/
        if(k==n)
        {
         for(int i=0;i<a.length;i++)
                System.out.print(a[i]);
            System.out.println("");
        }
        else{
        for(int i=0;i<a.length;i++)
        {
            int temp=a[k];
            a[k]=a[n];
            a[n]=temp;            
            Permutation(a,k+1,n);
            int temp2=a[k];
            a[k]=a[n];
            a[n]=temp2;
        }
        }
                
    }
    
}
