/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resursion;

/**
 *
 * @author sidhsaho
 */
public class CheckArraySorted {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 5, 3, 1, 4};
        System.out.println(checkSort(b, 0));
    }

    static boolean checkSort(int a[], int k) {
        if (k == a.length-1) {
            return true;
        }
        
        if(a[k]<a[k+1]){
            return checkSort(a, k+1);
        }
        return false;
    }
}
