/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author sidhsaho
 */
public class LongestSubstringWithoutRepeating {

    static int count;

    public static void main(String args[]) {
        String word = "ABDEFGABEF";
        int to;int from;int sum;
        for (from = 0; from < word.length(); from++) {
            for (to = from + 1; to < word.length(); to++) {
                //count++;
               
            System.out.println(word.substring(from, to));

        }
        //RecCombine("", word);
        System.out.println(count);

    }}
    static boolean checkRepeatation(String input)
    {
        
        HashSet h=new HashSet();
        for(int i=0;i<input.length();i++)
        {
            if(h.contains(input.charAt(i)))
                return true;
            else
                h.add(input.charAt(i));
        }
        if( input.length() > count)
                count=input.length();
        return false;
    }
    
    static void RecCombine(String prefix, String rest) {
        if (rest.length() == 0) {
            count++;
            System.out.print(prefix + " ");
        } else {
            RecCombine(prefix + rest.charAt(0), rest.substring(1));
            RecCombine(prefix, rest.substring(1));

        }
    }
}
