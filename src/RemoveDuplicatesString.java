
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhsaho
 */
public class RemoveDuplicatesString {
    public static void main(String args[])
    {
        String s="geeksforgeeks";
        LinkedHashSet<Character> h=new LinkedHashSet();
        for(int i=0;i<s.length();i++)
        {
            h.add(s.charAt(i));
        }
        System.out.println(h);
    }
}
