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
public class sortByFrequency {
    public static void main(String args[])
    {
        int a[]={5,2,2,8,5,6,8,8};
        sortingFrequency(a);
    }
    static void sortingFrequency(int a[])
    {
        int index[]={0,1,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    int temp1=index[i];
                    index[i]=index[j];
                    index[j]=temp1;
                }
            }
        }
        printArray.print(a);
        printArray.print(index);
    }
}
