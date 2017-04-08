/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class DiceThrow {
    public static void main(String args[])
    {
        test(6,3,8);
    }
    static void test(int m,int n,int x)
    {
        int a[][]=new int[n+1][x+1];
        for(int i=1;i<=x && i<=m;i++)
            a[1][i]=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=x;j++)
            {
                for(int k=1;k<=m&& k<j;k++)
                {
                    a[i][j]=a[i][j]+a[i-1][j-k];
                }
            }
        }
       for (int i = 0; i <= n; i++)
    {
      for (int j = 0; j <= x; j++)
      {
          System.out.print(a[i][j]+" ");   
      }          
        System.out.println("");
    }
        
    }
}
