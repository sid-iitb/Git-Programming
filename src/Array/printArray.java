/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author sidhsaho
 */
public class printArray {
    static int a[]={1,2,3,4,5,6,7};
    public static void main(String args[])
    {
        arrayRotate(2);
    }
    static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    static void reverPrint(int a[])
    {
        int temp;
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        print(a);
    }
    static void reverPrint(int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        print(a);
    }
    
    static void arrayRotate(int d)
    {
        reverPrint(0, d-1);
        reverPrint( d, a.length-1);
        reverPrint(0,a.length-1);
    }
}
