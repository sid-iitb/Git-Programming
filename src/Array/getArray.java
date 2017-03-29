/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Random;

/**
 *
 * @author sidhsaho
 */
public class getArray {

    public static int[] getArray(int n) {
        int a[] = new int[n];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt() + 1;
        }
        return a;
    }

    public static int[][] getArray(int m, int n) {
        int a[][] = new int[m][n];
        Random randNumGenerator = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = randNumGenerator.nextInt() + 1;
            }
        }
        return a;
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void printArray(int a[][]) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
