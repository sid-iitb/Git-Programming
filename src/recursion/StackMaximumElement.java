/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Stack;

/**
 *
 * @author sidhsaho
 */
public class StackMaximumElement {
    static int max;
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        returnHighest(s);
        System.out.println(max);
    }
    static void returnHighest(Stack s){
        if(s.empty())
            return;
        int d=(int) s.pop();
        if(max>d)
            max=d;
        returnHighest(s);
        s.push(d);
    }
}
