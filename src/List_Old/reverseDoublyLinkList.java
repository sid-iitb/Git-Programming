

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class reverseDoublyLinkList {
    // DoublyLinkedList l=new DoublyLinkedList();
       static node head=DoublyLinkedList.Main();
       static node tail=null;
    public static void main(String args[])
    {
        tail();
        head.display(head);        
        head.display2(tail);
        reverse();        
        head.display(head);        
        head.display2(tail);
    }
    static void tail()
    {
        node g=head;
        while(g.next !=null)
        {
            g=g.next;
        }
        tail=g;
    }
    static void reverse()
    {
        node f=head;
        node temp=null;
        //node save=null;
        while(f!=null)
        {
            temp=f.next;
           // save=f.next;
            f.next=f.prev;
            f.prev=temp;
            f=f.prev;
        }
        temp=head;
        head=tail;
        tail=temp;
    }
}
