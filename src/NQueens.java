/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class NQueens {
    static int N=16;
    static int sol[][]=new int[N][N];
    public static void main(String args[])
    {
        solve();
    }
    static void solve()
    {
        if(solver(0))
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
            System.out.println("not solvable");
    }
    static boolean solver(int col)
    {
        if(col>=N)
        {
            return true;
        }
        for(int i=0;i<N;i++)
        {
            if(issafe(i, col))
            {
                sol[i][col]=1;
                if(solver(col+1))
                    return true;
                sol[i][col]=0;
            }
            
        }
        return false;
    }
    static boolean issafe(int row,int col)
    {
        int i,j;
        for(i=0;i<col;i++)
        {
            if(sol[row][i]==1)
                return false;
        }
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
                if(sol[i][j]==1)
                {
                    return false;
                }
                       
        }
        for(i = row, j = col; j >= 0 && i < N; i++, j--)
        {
                if(sol[i][j]==1)
                    return false;
            
        }
        return true;
        
    }
    
}
