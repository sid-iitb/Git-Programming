/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author sidhsaho
 */
public class pairWithSum {
   public static void main(String args[])
   {
       int a[]={1, 2, 3, 4, 5, 6};
       int sum=7;
       pairWithSumValue(a, sum);
       printArray.reverPrint(a);
   }
   static void pairWithSumValue(int a[],int sum)
   {
       int count=0;
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a.length&&j!=i;j++)
           {
               if(a[i]+a[j]==sum)
               {count++;System.out.println(a[i]+"  "+a[j]);}
           }
       }
       System.out.println(count);
   }
   static void pairWithSumValue2(int a[],int sum)
   {
       HashMap h=new HashMap();
       for(int i=0;i<a.length;i++)
       {
           int temp=sum-a[i];
           if(temp >=0 && h.containsKey(temp))
               System.out.println(a[i]+" "+temp);
           h.put(a[i], "1");
       }
   }
}
