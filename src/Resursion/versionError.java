/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author sidhsaho
 */
public class versionError {
    
    static int a[]=new int[100];
    public static void main(String args[])
    {
        //System.out.println(a[1]);
        for(int i=2;i<a.length;i++)
            a[i]=1;
        
        System.out.println(recurseversion(0,a.length));
    }
    
    static int recurseversion(int low,int high)
    {
        
        int mid= low+(high-low)/2;
        //if(mid==0)return 0;
        if(mid>0){
        if(version(mid) && !version(mid-1))
            return mid;
        else if (version(mid))
            return recurseversion(low, mid-1);
        else
            return recurseversion(mid+1, high);}
        else
            return 0;
        
    }
    
    
    
    static boolean version(int i)
    {
        return a[i]==1;
    }
}
