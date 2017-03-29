/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_MINCOSTPATH {

    public static void main(String args[]) {
        int cost[][] = {{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}};
        //System.out.println(cost.length +" "+ cost[1].length);
        System.out.println(recursion(cost, cost.length - 1, cost[0].length - 1));
        dpsol(cost, cost.length, cost[0].length );
    }

    static int recursion(int cost[][], int x, int y) {
        if (x == 0 && y == 0) {
            return cost[0][0];
        } else if (x < 0 || y < 0) {
            return Integer.MAX_VALUE;
        } else {
            return cost[x][y] + Math.min(recursion(cost, x - 1, y - 1), Math.min(recursion(cost, x - 1, y), recursion(cost, x, y - 1)));
        }
    }

    static void dpsol(int cost[][], int x, int y) {
        int table[][] = new int[x][y];
        table[0][0] = cost[0][0];
        for (int i = 1; i < x; i++) {
            table[i][0] = table[i - 1][0] + cost[i][0];
        }
        for (int j = 1; j < y; j++) {
            table[0][j] = table[0][j - 1] + cost[0][j];
        }
        for(int i=1;i<x;i++)
        {
            for(int j=1;j<y;j++)
            {
                table[i][j]=cost[i][j]+Math.min(table[i-1][j], Math.min(table[i-1][j-1], table[i][j-1]));
            }
        }
        System.out.println(table[x-1][y-1]);
    }
}
