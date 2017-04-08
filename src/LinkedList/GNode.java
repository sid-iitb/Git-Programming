package LinkedList;
//import static LinkList.head;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class GNode<T> {
     
   GNode next;
   T data;
   GNode prev;
   GNode()
   {
       
   }
   GNode(T k)
   {
       data=k;
       next=null;
       prev=null;
   }
   void link(GNode n)
   {
       next=n;
   }
   void previous(GNode n)
   {
       prev=n;
   }
   int length(GNode head)
   {
       GNode n;
      int o=0;
       n=head;
        while(n != null)
        {
            o=o+1;
            n=n.next;
        }
        System.out.println("the length is :- "+o);
        return o;
   }
   void display(GNode head)
    {
        GNode n;
        n=head;
        System.out.print("HEAD");
        while(n != null)
        {
            System.out.print("->"+n.data);
            n=n.next;
        }
        System.out.println();
    }
   void display2(GNode tail)
   {
        GNode c=tail;
        while(c!=null)
        {
            System.out.print("->"+c.data);
            c=c.prev;
        }
        System.out.println();
   }
}
