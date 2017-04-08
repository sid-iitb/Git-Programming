package LinkedList;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sidhartha
 */
public class LLStack {
   node head;
   LLStack()
   {
       head=new node();
   }
   void push(int y)
   {
      // System.out.println("The element pushed is :-  "+y);

       if(head==null)
       {
           head=new node(y);
       }
       else 
       {
           node h=new node(y);
           h.next=head;
           head=h;
       }
   }
   int top()
   {
       if(head==null) throw new ArithmeticException("hi");
       else
           return head.data;
   }
   int pop()
   {
       if(head==null) throw new ArithmeticException();
       else
       {
           int da=head.data;
           head=head.next;
          // System.out.println("The element popped is :-  "+da);
           return da;
       }
   }
}
