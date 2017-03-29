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
public class ratInMazePuzzle {
    
    static int puzzle[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
    static int N =puzzle.length;
    static int solution[][] = new int[N][N];

    public static void main(String args[]) {
        if(backtracksolution(0, 0))
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    System.out.print(solution[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }

    static boolean isSafe(int x, int y) {
        return x > -1 && y > -1  && x < N && y < N && puzzle[x][y] == 1;
    }
    static boolean backtracksolution(int x, int y)
    {
        if(x==N-1 && y==N-1){
            solution[x][y]=1;
            return true;}
        if(isSafe(x, y)){
            solution[x][y]=1;
            if(backtracksolution(x+1, y)||backtracksolution(x, y+1))
                return true;
            solution[x][y]=0;
            return false;
        }
        return false;
    }
    
}
