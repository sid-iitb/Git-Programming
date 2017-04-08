/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class SubArray {
    public static void main(String atgs[]) throws Exception 
    {
        foo(1);
    }
    static void foo(int n) throws Exception
    {
        
        System.out.print(n+" ");
        try{
        int s=1/(1000-n);}
        catch(Exception e)
        {
            System.exit(0);
        }
        foo(n+1);
    }
}
