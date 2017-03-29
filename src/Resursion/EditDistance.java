/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class EditDistance {
    static String s1="sunday";
    static String s2="saturday";
    public static void main(String args[])
    {
        System.out.println(recursion(s1.length()-1, s2.length()-1));
        HashMap<Integer,Integer> h=new HashMap();
        h.put(11,12);
        h.put(13,14);
        System.out.println("coo"+h.get(13));
        Iterator it=(Iterator) h.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,Integer> entry=  (Map.Entry<Integer,Integer>) it.next();
            System.out.println(entry.getKey());
        }
    }
    static int recursion(int l1,int l2)
    {
        if(l1==0)
            return l2;
        if(l2==0)
            return l1;
        if(s1.charAt(l1)==s2.charAt(l2))
            return recursion(l1-1, l2-1);
        else{
        return 1+Math.min(recursion(l1-1, l2), Math.min(recursion(l1, l2-1),recursion(l1-1, l2-1)));
        }
    }
}
