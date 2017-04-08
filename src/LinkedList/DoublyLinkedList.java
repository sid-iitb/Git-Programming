/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author sidhartha
 */
public class DoublyLinkedList {
    static node head=null;
    static node tail=null;
    public static node Main()
    {
        insertatbegin(5);
        insertatbegin(4);
        insertatbegin(3);
        insertatbegin(2);
        insertatbegin(1);
        insertatend(6);
        insertatend(7);
        insertatend(8);
        insertatend(9);
        insertatend(10);
        //head.display(head);
        //head.display2(tail);
        return head;
    }
    static void insertatbegin(int k)
    {
        node n=new node(k);
        if(head == null)
        {
            tail=n;
        }
        else
        head.prev=n;
        n.next=head;
        head=n;
        
    }
    static void insertatend(int k)
    {
        node n=new node(k);
        if(tail== null)
            head=n;
        else
            tail.next=n;
        n.prev=tail;
        tail=n;
    }
}
