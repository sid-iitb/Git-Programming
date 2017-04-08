package LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */

public class LinkList {
    static node head=null;
    public static node Main()
    {
        //LinkedList<node> s=new LinkedList<>();
        
        //head=
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
       return head;
    }
    
    static void insertatbegin(int y)
    {
       // System.out.println("dude");
        node n=new node(y);
        //n.data=y;
        n.link(head);
        head=n;
       // display();
        //return head;
    }
    static node insertatbegin(node head,int y)
    {
       // System.out.println("dude");
        node n=new node(y);
        //n.data=y;
        n.link(head);
        head=n;
        
       // display();
        return head;
    }
    static void insertatend(int y)
    {
        node n=new node(y);
        //n.data=y;
        node t=head;
        if(t==null)
        {
            head=n;
        }
        else
        {
            while(t.next !=null)
            {
                t=t.next;
            }
            t.next=n;
        }
        //display();
    }
}
