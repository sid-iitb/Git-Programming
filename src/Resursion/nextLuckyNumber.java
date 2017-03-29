/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author sidhsaho
 */
public class nextLuckyNumber {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            BigInteger N=sc.nextBigInteger();
           // BigInteger check=N.add(BigInteger.ONE);
            N=N.add(BigInteger.ONE);
            while(((N+"").length() - (N+"").replace("5", "").length()) +((N+"").length() - (N+"").replace("3", "").length()) != (N+"").length())
            {
                N=N.add(BigInteger.ONE);
            }
            System.out.println(N);
        }
        
        
    }
    
    static BigInteger luckynumber(BigInteger number)
    {
        String num = number+"";
        
        if((num.length() - num.replace("5", "").length()) +(num.length() - num.replace("3", "").length()) == num.length())
        {
            return number;
        }
        
        BigInteger check=number.add(BigInteger.ONE);
        while(((check+"").length() - (check+"").replace("5", "").length()) +((check+"").length() - (check+"").replace("3", "").length()) == (check+"").length())
        {
            check=number.add(BigInteger.ONE);
        }
        return luckynumber(number.add(BigInteger.ONE));
    }
}
