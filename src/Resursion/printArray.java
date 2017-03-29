/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashMap;

/**
 *
 * @author sidhsaho
 */
public class printArray {

    public static void printArray(int a[]) {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
        
    }
    
    public static void printArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    
}
