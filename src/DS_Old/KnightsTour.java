/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class KnightsTour {
    //static int board[][]=new int[8][8];
    //static int xaxis[]=new int[8];
    //static int yaxis[]=new int[8];
    
    public static void main(String args[])
    {
        //System.out.println("sd"+board[1][2]);
        solve();
       /* for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(board[i][j]+" ");}
            System.out.println("");}*/
    }
    static boolean safe(int x,int y,int board[][])
    {
        if(x>=0 && x<8 && y>=0 && y<8 && board[x][y]==-1)
        {
            return true;
        }
        return false;
    }
    static void solve()
    {
        int board[][]=new int[8][8];
        for(int i=0;i<8;i++)
           for(int j=0;j<8;j++)
              board[i][j]=-1;
        board[0][0]=0;
        int xaxis[]={2, 1, -1, -2, -2, -1,  1,  2};
        int yaxis[]={1, 2,  2,  1, -1, -2, -2, -1};
        if(couldsolve(0, 0, xaxis, yaxis, 1,board))
        {
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(board[i][j]+" ");}
            System.out.println("");}
        }
        else{
            System.out.println("not posible");
        for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(board[i][j]+" ");}
            System.out.println("");}}
              
    }
    static boolean couldsolve(int x,int y,int xaxis[],int yaxis[],int move,int board[][])
    {
        int nextx,nexty;
        if(move==64)
        {
            return true;
        }
        for(int k=0;k<8;k++)
        {
            nextx=x+xaxis[k];
            nexty=y+yaxis[k];
            if(safe(nextx, nexty,board))
            {
                board[nextx][nexty]=move;
                if(couldsolve(nextx, nexty, xaxis, yaxis,move+1,board))
                {
                    return true;
                }
                else
                    board[nextx][nexty]=-1;
            }
        }
        return false;
    }
}
