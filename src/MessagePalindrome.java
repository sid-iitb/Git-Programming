/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class MessagePalindrome {
    public static void main(String args[])
    {
        System.out.println(Solution1("abc"));
    }
    
    public static int Solution1(String str)
    {
        int total = 0;
 int charsToCompare = ((int)Math.floor(str.length()/2));
 for(int i =0; i<str.length()/2;i++)
 {
 total+=(int)Math.abs((int)str.charAt(str.length()-1-i)-(int)str.charAt(i)); 
 }
 return total;
        }
}
