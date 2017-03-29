/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class MergeSort {
    static int array[]={8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        
        merge(0, array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
    static void merge(int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            merge(low, mid);
            merge(mid+1,high);
            mergeSort(low,mid,high);
        }
    }
    
    static  void mergeSort(int low,int mid,int high){
        int a1[]=new int[mid+1];
        int a2[]=new int[mid+1];
        int first;
        for(first=0;first<mid;first++){
            a1[first]=array[first+low];            
        }
        a1[first]=Integer.MAX_VALUE;
        first=0;
//        for(;first<mid;first++){
//            a2[first]=array[];            
//        }
//        a2[in]=Integer.MAX_VALUE;
        int i=a1.length;
        int j=a2.length;
        int c=low;
        while(i!=a1.length && j!=a2.length){
            if(a1[i]<=a2[j]){
                array[c]=a1[i];
                i++;
            }
            else{
                array[c]=a2[j];
                j++;
            }            
            c++;
        }
        
    }
    
}
