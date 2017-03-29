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
public class nQueens {

    static int puzzle[][] = {{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}};
    static final int N = 4;
    static int solution[][] = new int[N][N];
    public static void main(String args[])
    {
        if(solve(0))
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
    static boolean isSafe(int row, int col) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (puzzle[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (puzzle[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (puzzle[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean solve(int col) {
        System.out.println("col is"+col+" "+N);
        if (col >= N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            
            if (isSafe(i, col)) {
                solution[i][col] = 1;
                puzzle[i][col]=1;
                if(solve(col+1))
                    return true;
                solution[i][col]=0;
                puzzle[i][col]=-1;
            }
            
        }
        return false;
    }

}
