/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(456));
    }
    
    static int reverseNum(int n){
        if(n<10){
            return n;
        }
        else{
            return ((n%10) * (int)Math.pow(10, (int)Math.log10(n)))+ reverseNum(n/10);
        }
        
    }
}
