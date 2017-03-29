/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class Array_Spiral {

    public static void main(String args[]) {
        int a[][] = {{1, 2, 3, 4,5}, { 6, 7, 8,9,10}, {11, 12,13,14,15}, {16,17,18,19,20},{21,22,23,24,25}};
        int x = 3, y = 3;int i;
        int start = 0, end = 0;
        while (start <= x && end <= y) {
            for (i = start; i <= x; i++) {
                System.out.println(a[start][i]+" ");
            }
            start++;
            for(i=start;i<=y;i++)
            {
                System.out.println(a[i][y]+" ");
            }
            y--;
            for(i=y;i>=end;i--)
                System.out.println(a[x][i]+" ");
            x--;
            for(i=x;i>=start;i--)
                System.out.println(a[i][end]+" ");
            end++;
        }
    }
}
