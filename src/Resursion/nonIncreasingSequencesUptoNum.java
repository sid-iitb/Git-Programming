/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
package recursion;
public class nonIncreasingSequencesUptoNum {
    public static void main(String args[])
    {
        int num=5;
        int a[]=new int[num];
        generateSequence(a,num,0,0);
    }
    
    static void generateSequence(int a[],int num,int currInx,int currSum)
    {
        if(currSum==num){
            printArray.printArray(a,currInx);
            return;
        }
        int x=1;
        while(x <= num-currSum &&( currInx==0 || x<= a[currInx-1]))
        {
            a[currInx]=x;
            generateSequence(a, num, currInx+1, currSum+x);
            x++;
        }
    }
}
