/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author sidhsaho
 */
public class permutationOfString {
static int count=0;
    public static void main(String args[]) {
        char a[] = {'A', 'B', 'C','D'};
        permute(a, 0);

    }

    static void permute(char a[], int ind) {
        if (ind == a.length-1) {
            
            count++;
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println(ind+ "  "+count+"");
        } else {
            for (int i = ind; i < a.length; i++) {

                char temp;
                temp = a[i];
                a[i] = a[ind];
                a[ind] = temp;
                permute(a, ind + 1);
                char temp1;
                temp1 = a[i];
                a[i] = a[ind];
                a[ind] = temp1;

            }
        }
    }

}
