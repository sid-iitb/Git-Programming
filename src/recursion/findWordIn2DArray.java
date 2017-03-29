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
public class findWordIn2DArray {

    static char a[][] = {{'X', 'B', 'C', 'R'},
                         {'A', 'T', 'E', 'E'},
                         {'Y', 'E', 'F', 'D'},
                         {'T', 'S', 'Y', '_'}
    };
    static int M = 4;
    static int N = 4;
    static char w[] = {'X', 'T','Y'};
    static int W = w.length;
    static int solution[][] = new int[M][N];
    static boolean visited[][]=new boolean[M][N];
    static int xmove[]={1, 1, -1, -1,  0, -1,  1,  0};
    static int ymove[]={1, 0,  0, -1, -1,  1, -1,  1};

    public static void main(String args[]) {
        if (recursive(0, 0, 0)) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("fuck");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println("");
            }
        }

    }

    static boolean isSafe(int x, int y) {
        return x >= 0 && y >= 0 && x < M && y < N && !visited[x][y];
    }

    static boolean recursive(int x, int y, int ind) {
        int next_x,next_y;
        visited[x][y]=true;
        if (ind == W) {
            return true;
        }
        if(a[x][y]==w[ind])
        {
            //visited[x][y]=true;
            solution[x][y]=ind+1;
            ind++;
        }
        
        //System.out.println("x y "+x+" "+y);
        for(int i=0;i<8;i++)
        {
            next_x=x+xmove[i];
            next_y=y+ymove[i];
            
            if(isSafe(next_x, next_y))
            {
                //visited[next_x][next_y]=true;
                
                //System.out.println("solu"+ind);
               
               if(recursive(next_x, next_y, ind)){
                   //solution[next_x][next_x] = ind;
                   return true;}
               //visited[next_x][next_y]=false;
            }
        }
        
        return false;
    }
}
