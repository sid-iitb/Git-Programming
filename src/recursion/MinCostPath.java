/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author sidhsaho
 */
public class MinCostPath {

    static int pathArray[][] = {
        {1, 2, 3},
        {4, 8, 2},
        {1, 5, 3}
    };
    static int minCost;
    static int maxPathX = 3;
    static int maxPathY = 3;
    public static void main(String args[]) {
        System.out.println(minCostRecusrion(0, 0));
    }

    static int minCostRecusrion(int x, int y) {
        if(x>=maxPathX || y>=maxPathY)
            return 100000;
        else if(x==maxPathX-1 && y==maxPathY-1)
        {
            
            return pathArray[x][y];
        }
        else
        {
            
            return pathArray[x][y]+Math.min(minCostRecusrion(x+1, y+1),
                    Math.min(minCostRecusrion(x, y+1), minCostRecusrion(x+1, y)));
            //return minCost;
        }
        
    }
}
