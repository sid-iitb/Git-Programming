/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

import java.util.HashMap;

/**
 *
 * @author sidhsaho
 */
public class majorityArray {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,2,2};
        majorityElement2(a);
    }
    static void majorityElement(int a[])
    {
        int maj=0;
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[maj]==a[i])
                count++;
            else
                count--;
            if(count==0)
            {
                maj=i;
                count=1;
            }
        }
        System.out.println(a[maj]);
        int elcount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==a[maj])
                elcount++;
            
        }
        if(elcount > a.length/2 )
        {
            System.out.println(a[maj]);
        }
        else
        {
            System.out.println("none");
        }
    }
    static void majorityElement2(int a[])
    {
        HashMap h=new HashMap();
        for(int i=0;i<a.length;i++)
        {
            if(!h.containsKey(a[i]))
            {
                h.put(a[i], 1);
            }
            else
            {
                int n=(int) h.get(a[i]);
                h.put(a[i], n+1);
                if((n+1)==(a.length/2)+1)
                    System.out.println(a[i]);
            }
            
        }
        
    }
    
}
