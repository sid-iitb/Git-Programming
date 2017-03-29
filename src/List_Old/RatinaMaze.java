/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class RatinaMaze {
    public static void main(String args[])
    {
        
        int Maze[][]={ {1, 0, 0, 0},
                       {1, 1, 0, 1},
                       {0, 1, 0, 0},
                       {1, 1, 1, 1}
                     };
    
    
        
        int sol[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        solve(Maze,sol);
    }
    static void print(int sol[][])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static boolean issafe(int Maze[][],int x,int y)
    {
        if(x>=0 && y<4 && x<4 && y>=0 && Maze[x][y]==1)
        {
            return true;
        }
        return false;
    }
    static void solve(int Maze[][],int sol[][])
    {
        if(solver(Maze, sol, 0, 0))
        {
            print(sol);
        }
        else
            System.out.println("No Such Path");
    }
    static boolean solver(int Maze[][],int sol[][],int x,int y)
    {
        if(x==3 && y==3)
        {
            sol[x][y]=1;
            return true;
        }
        if(issafe(Maze, x, y))
        {
            sol[x][y]=1;
            
                if(solver(Maze, sol, x+1, y))
                    return true;
                if(solver(Maze, sol, x, y+1))
                    return true;
                else
                {
                    sol[x][y]=0;
                    return false;
                }
                         
        }
        
        return false;
    }
    
    
}
