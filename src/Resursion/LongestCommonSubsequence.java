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
public class LongestCommonSubsequence {
    static String s1="AGGTAB";
    static String s2="GXTXAYB";
    static int a[][]=new int[s1.length()+1][s2.length()+1];
    public static void main(String args[])
    {
        int l1=s1.length();
        int l2=s2.length();
        System.out.println("LCSRecusion "+LCSRecusrion(l1,l2));
        LCSDyanamic(s1.length(), s2.length());
    }
    static int LCSRecusrion(int l1,int l2)
    {
        if(l1==0 || l2==0)
        {
            return 0;
        }            
        if(s1.charAt(l1-1)==s2.charAt(l2-1))
        {
            System.out.print(s1.charAt(l1-1));
            return 1+LCSRecusrion(l1-1, l2-1);
        }
        else
        {
            return Math.max(LCSRecusrion(l1-1, l2), LCSRecusrion(l1, l2-1));
        }
    }
    
    static void LCSDyanamic(int l1,int l2)
    {
        for(int i=1;i<l1+1;i++)
        {
            for(int j=1;j<l2+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    a[i][j] = 1+a[i-1][j-1];
                else
                    a[i][j]=Math.max(a[i-1][j], a[i][j-1]);
                
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    }
}
