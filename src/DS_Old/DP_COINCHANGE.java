/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SID
 */
public class DP_COINCHANGE {
static int min;
static int min1[]={1,3,5};
    public static void main(String args[]) {
        int S[] = {1, 3, 5};
        int N = 11;
        //System.out.println(recursion(S, S.length, N));
        dpsol(S, S.length, N);
    }

    static int recursion(int arr[], int len, int N) {
        
        if (N == 0) {
            
            return 1;
        }
        if (N < 0) {
            return 0;
        }
        if (len <= 0 && N >= 1) {
            return 0;
        }
        int y=recursion(arr, len-1, N);
       
        int x=recursion(arr, len, N- arr[len - 1]);
        
        return Math.min(x,y);
    }

    static void dpsol(int arr[], int len, int N) {
        int table[][] = new int[N + 1][len];
        int store[][]=new int[N+1][len];
        int result=Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0) {
                    table[i][j] = 1;
                    store[i][j]=0;
                }
                else
                {
                    int x = (i - arr[j] >= 0) ? table[i - arr[j]][j] : 0;
                    int y = (j >= 1) ? table[i][j - 1] : 0;
                    table[i][j] = x + y;
                    result=Math.min(result, table[i][j]);
                }
                
            }
        }
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(table[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(result);
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<len;j++)
            {
              //  System.out.print(store[i][j]+" ");
            }
           // System.out.println("");
        }
        System.out.println(table[N][len-1]);
    }
}
