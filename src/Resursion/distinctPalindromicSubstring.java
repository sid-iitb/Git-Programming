/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sidhsaho
 */
public class distinctPalindromicSubstring {

    public static void main(
            String[] args) {
        String str = "aabaa";
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++)
            for (int j = i+1; j <= str.length(); j++)
                if (isPalindrome(str.substring(i, j)))
                    set.add(str.substring(i, j));
        System.out.println(set);
    }

    public static boolean isPalindrome(
            String str) {
        if (str.length() > 0) {
            for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
                if (str.charAt(i) == str.charAt(j))
                    continue;
                else
                    return false;
            }
            return true;
        } else
            return false;
    }}
