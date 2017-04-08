/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIDHARTHA
 */
public class DP_Sequence {
    public static void main(String args[])
    {
        int a[]={1,2,3};
        System.out.println(sequence(a, a.length));
    }
    static int sequence(int a[],int length)
    {
        if(length==0)
            return 1;
        return sequence(a, length-2)+sequence(a, length-1);
        
        
    }
}
