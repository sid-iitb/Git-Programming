package DS_Old;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class Main {
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(buf.readLine());
        for(int i=0;i<n;i++)
        {
            String a[]=buf.readLine().split(" ");
            long x=Long.parseLong(a[0]);
            long y=Long.parseLong(a[1]);
            if(x==0 && y==0)
            {
                System.out.println("0 0");
            }
            else if(x==0)
            {
                System.out.println("0 0");
            }
            else if(y==0)
                System.out.println("0 "+a[0]);
           else
                System.out.println(x/y +" "+x%y );
        }
    }
}
