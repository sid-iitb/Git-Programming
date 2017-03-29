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
public class mergeArray {
    public static void main(String args[])
    {
        int a[]={6,0,7,0,0,10,0};
        int b[]={5,8,12,14};
        mergeArrays(a, b);
    }
    static void mergeArrays(int a[],int b[])
    {
        int j=0;
        int i=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[j]=a[i];
                j++;
            }
        }
        printArray.print(a);
        int y=b.length-1;
        int z=j-1;
        printArray.print(b);
        //System.out.println(z+" "+y);
        for(int x=a.length-1;x>=0;x--)
        {
            if(y>-1 && z>-1 && b[y]>a[z] )
            {
                a[x]=b[y];
                y=y-1;
                
            }
            else if(y>-1 && z>-1 && b[y]<=a[z])
            {
                a[x]=a[z];
                z=z-1;
            }
            else if(y<0)
            {
                //a[x]=a[z];
                z=z-1;
            }
            else if(z<0)
            {
                a[x]=b[y];
                y=y-1;
            }
        }
        printArray.print(a);
    }
}
