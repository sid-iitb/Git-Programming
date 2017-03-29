/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class StackImplementation {
       static  LLStack l=new LLStack();
    public static void main(String args[])
    {
        l.push(5);
        l.push(2);
        l.push(3);
        l.push(1);
        l.push(4);
        LLStack t=reverse();
        while(t.head!=null)
            System.out.println(t.pop()+"   top :- "+t.top());
    }
    static LLStack reverse()
    {
        LLStack s=new LLStack();
        while(l.head!=null)
        {
            int temp=l.pop();
            while(s.head != null && s.top()>temp)
            {
                l.push(s.pop());
            }
            s.push(temp);
        }
        return s;
    }
}
