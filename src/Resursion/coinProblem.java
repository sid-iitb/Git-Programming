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
public class coinProblem {
    static int a[]=new int[10];
    public static void main(String args[])
    {
        int S[]={1,2, 3,4};
        int N=4;
        System.out.println("Total solution "+coinUsage(S,N,S.length,0));
        System.out.println("Tot"+partition(N));
    }
    static int coinUsage(int S[],int N, int ind,int i)
    {
        if(N==0){
            printArray.printArray(a,i);
            return 1;}
        if(N<=0)
            return 0;
        if(ind<=0 && N>0)
            return 0; 
        //If included
        a[i]=S[ind-1];
        int x=coinUsage(S, N-S[ind-1], ind,i+1);
        
        //If not included
        int y =coinUsage(S, N, ind-1,i);
        return x+y;
    }
    static int partition(int num)
    {
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=i+1;
        int i, j, x, y;
 
    int table[][]=new int[num+1][num];
    
    for (i=0; i<num ;i++)
        table[0][i] = 1;
 
    for (i = 1; i < num+1; i++)
    {
        for (j = 0; j < num; j++)
        {
            x = (i-arr[j] >= 0)? table[i - arr[j]][j]: 0;
 
            y = (j >= 1)? table[i][j-1]: 0;
 
            table[i][j] = x + y;
        }
    }
    return table[num][num-1];
        
    }
    
}
