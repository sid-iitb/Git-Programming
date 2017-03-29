/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class DP_EXAMPLE {
    
    public static void main(String args[]) throws Exception
    {
     String A="XY",B="X",C="XXY";
     char []A1=A.toCharArray();
     char []B2=B.toCharArray();
     char []C2=C.toCharArray();
     test(A1,B2,C2);
    }
    static boolean test(char A[],char B[],char C[]) throws Exception
    {
        boolean IL[][]=new boolean[A.length+1][B.length+1];
        System.out.println("");
        int M=A.length;
        int N=B.length;
        //for(int i=0;i<M;i++)
         //   System.out.print(A[i]+" ");
        
        //for(int i=0;i<N;i++)
           // System.out.print(B[i]+" ");
        //System.exit(0);
        if((M+N)!=C.length)
            return false;
        for (int i=0; i<=M; ++i)
    {
        for (int j=0; j<=N; ++j)
        {
            // two empty strings have an empty string
            // as interleaving
            if (i==0 && j==0)
                IL[i][j] = true;
 
            // A is empty
            else if (i==0 && B[j-1]==C[j-1])
                IL[i][j] = IL[i][j-1];
 
            // B is empty
            else if (j==0 && A[i-1]==C[i-1])
                IL[i][j] = IL[i-1][j];
 
            // Current character of C matches with current character of A,
            // but doesn't match with current character of B
            else if(i>0 && A[i-1]==C[i+j-1] && B[j-1]!=C[i+j-1])
                IL[i][j] = IL[i-1][j];
 
            // Current character of C matches with current character of B,
            // but doesn't match with current character of A
            
            else if (j>0 && A[i-1]!=C[i+j-1] && B[j-1]==C[i+j-1] )
                IL[i][j] = IL[i][j-1];
 
            // Current character of C matches with that of both A and B
            else if (A[i-1]==C[i+j-1] && B[j-1]==C[i+j-1])
                IL[i][j]=(IL[i-1][j] || IL[i][j-1]) ;
        }
    }
        for(int i=0;i<M+1;i++)
        {
            for(int j=0;j<N+1;j++)
            {
                System.out.print(IL[i][j]+"   ");
            }
            System.out.println("");
        }
        return IL[M][N];
    }
    
    
}
