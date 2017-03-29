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
public class equalCandiesDistribution {
    public static void main(String args[])
    {
        int a[]={8,9,8,8};
       
        System.out.println("\n"+recursion(a,0)+" ji");
    }
    
    
    static int recursion(int a[],int i)
    {
        if(i==a.length)
        {
            System.out.println(i+"sdfjds");
            int count=0;
            for(int w=0;w<a.length;w++)
            {
                if(w!=a.length-1 && a[w]==a[w+1])
                {
                    count++;
                }
                System.out.print(a[w]+" ");
            }
            
            if(count==a.length-1)
                return 1;
            else
                return 0;
        }
        
        for(int ind=0;ind<a.length && ind !=i ;ind++)
        {
            a[ind]=a[ind]+1;
            
            //System.out.print(ind+" ");
            //return recursion(a, i+1);
        }
        System.out.println("not chosen"+i);
        return Math.min(recursion(a, i+1),recursion(a, i-1));
    }
}
