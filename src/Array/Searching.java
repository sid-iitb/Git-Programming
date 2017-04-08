/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

import java.util.Arrays;

/**
 *
 * @author sidhsaho
 */
public class Searching {
    public static void main(String args[])
    {
        int a[]={1,3,2,5,4};
        int search=2;
        sequential(a,search);
        binarySearch(a, 0, a.length-1, search);
        Arrays.sort(a);
        binarySearchRecursion(a, 0, a.length-1, search);
        int b[]={3,4,5,1,2};
        searchInPivotArray(b, search);
    }
    static void sequential(int a[],int search)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                System.out.println("Got It in "+(i+1));
                return;
            }
                
        }
        System.out.println("Sorry not der");
        
    }
    static void binarySearch(int a[],int low,int high,int search)
    {
        Arrays.sort(a);
        // 4
        //1 2 3 4 5
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(a[mid]==search)
            {
                System.out.println("Got It In "+(mid+1));
                return;
            }
            else if(a[mid]<search)
                low=mid+1;
            else
                high=mid-1;
        }
        System.out.println("Sorry ");
        
    }
    static int binarySearchRecursion(int a[],int low,int high,int search)
    {
        if(low>high)
        {
            System.out.println("Not Found");
            return -1;
        }
        else{
        int mid=low+((high-low)/2);
        if(a[mid]==search)
        {
            System.out.println("Got It"+(mid+1));
            return mid+1;
        }
        else if (a[mid]<search)
            return binarySearchRecursion(a, mid+1, high, search);
        else
            return binarySearchRecursion(a, low, mid-1, search);
        }
    }
    
    static void searchInPivotArray(int a[],int search)
    {
        int pivot=0;
        
    }
}
