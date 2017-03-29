/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author sidhsaho
 */
public class SortArrayByFrequency {

    static int a[][] = {{0,1},{1,2},{2,3},{3,3},{4,2},{5,3}};
    
    
    
    public static void main(String[] args) {
        Arrays.sort(a, new Comparator<int[]>(){
            
            @Override
            public int compare(int[] a1, int[] a2) {
                 if(a1[1]>a2[1]) {
                return 1;
            } else if(a1[1]<a2[1]) {
                return -1;
            } else {
                if(a1[0]>a2[0]) {
                    return -1;
                } else if(a1[0]<a2[0]) {
                    return 1;
                } else {
                    return 0;
                }
            }}
        
        
        });
        getArray.printArray(a);
    }
}
