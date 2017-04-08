/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sid
 */
public class DP_EGG {

    public static void main(String args[]) throws Exception {
        //BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        //int T=Integer.parseInt(buf.readLine());
        //for(int i=0;i<T;i++)
        //{
        // int N=Integer.parseInt(buf.readLine());
        int N = 10;
        System.out.println(eggdrop(2, N));
        // }
        dpeggdrop(2, N);
    }

    static int eggdrop(int n, int k) {
        if (k == 1 || k == 0) {
            return k;
        }
        if (n == 1) {
            return k;
        }
        int res, min = Integer.MAX_VALUE;
        for (int x = 1; x <= k; x++) {
            res = Math.max(eggdrop(n - 1, x - 1), eggdrop(n, k - x));
            if (res < min) {
                min = res;
            }
        }
        return min + 1;
    }

    static void dpeggdrop(int n, int k) {
        /*int table[][]=new int[n+1][k+1];
         for(int i = 0;i<=n;i++)
         {
         for(int j=0;j<=k;j++)
         {
         if(i==0||j==0)
         table[i][j]=0;
         else if(i==1)
         table[i][j]=j;
         else if(j==1)
         table[i][j]=1;
         else
         table[i][j]=Integer.MAX_VALUE;
         for(int x=1;x<=j;x++)
         {
         int res=1+Math.max(table[n-1][x-1], table[n][k-x]);
         if(res<table[i][j])
         table[i][j]=res;
         }
         }
         }
         System.out.println(table[n][k]);*/
        int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;

        // We need one trial for one floor and0 trials for 0 floors
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }

        // We always need j trials for one egg and j floors.
        for (j = 1; j <= k; j++) {
            eggFloor[1][j] = j;
        }

        // Fill rest of the entries in table using optimal substructure
        // property
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + Math.max(eggFloor[i - 1][x - 1], eggFloor[i][j - x]);
                    if (res < eggFloor[i][j]) {
                        eggFloor[i][j] = res;
                    }
                }
            }
        }
        System.out.println(eggFloor[n][k]);
    }
}
