package LinkedList;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sidhartha
 */
public class LoopedLinkedList {
    static node head=LinkList.Main();
    /*public static void main(String args[])
    {
        head.display(head);
        head=sixshaped();
        head.display(head);
    }*/
    node linear()
    {
        return head;
    }
    node circular()
    {
        node y=head;
        while(y.next != null)
        {
            y=y.next;
        }
        y.next=head;
        return head;
    }
    node sixshaped()
    {
        node n=head;
        int len=n.length(head)/2;
        while(len != 0)
        {
            len=len-1;
            n=n.next;
        }
        node y=head;
        while(y.next != null)
        {
            y=y.next;
        }
        y.next=n;
        
        //System.out.println(n.data);
        return head;
    }
}
