/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class MinMax {
    //static int a[]={1,23,2,4,3,0,32,,89};
    public static void main(String args[])
    {
      //int ab[]=new int[8];
      int ab[]={1,2,10,4,5,0,9,8};
      int re[]=minmax(ab,0,ab.length-1);
        System.out.println(re[0]+"   "+re[1]);
    }
    static int[] minmax(int a[],int low,int high)
    {
        //int min,max;
        int f[]=new int[2];

        if(low==high)
        {
        //    min=max;
            f[0]=a[low];
            f[1]=a[low];
            return f;
        }
        if(low+1==high)
        {
            if(a[low]>a[high])
            {
                f[1]=a[low];
                f[0]=a[high];
                
            }
            else
            {
                f[1]=a[high];
                f[0]=a[low];
                //return f;
            }
            return f;
        }
        int mid=(high+low)/2;
        int minx[]=minmax(a, low, mid);
        int maxx[]=minmax(a, mid+1, high);
        
        if(minx[0]>maxx[0])
            f[0]=maxx[0];
        else
            f[0]=minx[0];
        
        if(maxx[1]>minx[1])
            f[1]=maxx[1];
        else
            f[1]=minx[1];
        return f;
    }
}
