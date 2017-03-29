/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author sidhsaho
 */
public class ArrayRotation {

    static int a[] = getArray.getArray(7);
    static int b[]={1,2,3,4,5,6,7};
    public static void main(String args[]) {
        getArray.printArray(a);
        rotateArray(a, 0, 1);
        rotateArray(a, 2, a.length - 1);
        rotateArray(a, 0, a.length - 1);
        getArray.printArray(a);
        rotateJuggling();
        getArray.printArray(b);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static void rotateJuggling() {
        int d = 2;
        for (int k = 0; k < gcd(b.length,d);k++) {
            int temp=b[k];
            int i=k;
            int j=i+d;
            while(j<b.length){
                b[i]=b[j];
                i=j;
                j=j+d;
            }
            //j=j-b.length;
            b[i]=temp;
        }
    }

    static void rotateArray(int a[], int x, int y) {
        while (x < y) {
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
            x++;
            y--;
        }

    }
}
