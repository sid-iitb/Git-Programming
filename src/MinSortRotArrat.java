/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class MinSortRotArrat {
    public static void main(String args[])
    {
        int a[]={3,4,5,1,2};
        System.out.println(solver(a,0,a.length-1));
        
    }
    /*static void solver(int a[])
    {
        
    }
    */   
    
    
    static int solver(int a[],int l,int h)
    {
        
        if(h<l)
            return a[0];
        if(h==l)
            return a[l];
        int m=(l+h)/2;
        if(a[m+1]<a[m])
            return a[m+1];
        if(a[m]<a[m-1])
            return a[m];
        if(a[h]>a[m])
            return solver(a, l, m-1);
        return solver(a, m+1, h);
        
    }
    static void binary(int a[],int l,int h,int num)
    {
        if(l==h){
            System.out.println("100");}
        int mid=(l+h)/2;
        if(a[mid]==num){
            System.out.println(mid+1);
            return;}
        if(a[mid]>num)
            binary(a, l, mid-1, num);
        else
            binary(a,mid+1,h,num);
    }
}
