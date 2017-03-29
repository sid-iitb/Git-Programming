/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sidhsaho
 */
public class IntelligentGirl {
    static boolean result[][];
    public static void main(String args[]) throws Exception
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String NM[] = br.readLine().split(" ");
            String M[]=br.readLine().split(" ");
            String N[]=br.readLine().split(" ");
            result=new boolean[N.length][M.length];
            if(resultant(0,M,N))
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        
    }
    
    static boolean safe(int row,int col,String M[],String N[])
    {
        for(int i=col;i>=0;i--)
        {
            if(result[row][i])
                return false;
        }
        return !(col<0 || row<0 || col > M.length || row >N.length)  && Integer.parseInt(M[col])>Integer.parseInt(N[row]);
    }
    static boolean resultant(int col,String M[],String N[])
    {
        if(col>=M.length)
        {
            return true;
        }
        for(int i=0;i<N.length;i++)
        {
            if(safe(i,col,M,N))
            {
                result[i][col]=true;
                if(resultant(col+1,M,N))
                    return true;
                result[i][col]=false;
            }
        }
        return false;
    }
}
