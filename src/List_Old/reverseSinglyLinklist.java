

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class reverseSinglyLinklist {
    LinkList l=new LinkList();
       static node head=LinkList.Main();
    public static void main(String args[])
    {
        
        head.display(head);
        System.out.println("After reverse");
        reverse2(head);
        head.display(head);
    }
    
    static void reverse()
    {
        node q=null;
        node r=null;
        while(head!=null)
        {
            q=head.next;
            head.next=r;
            r=head;
            head=q;
        }
        head=r;
    }
    static void reverse2(node n)
    {
        if(n.next == null)
        {
            head=n;
            return;
        }
        reverse2(n.next);
        n.next.next=n;
        n.next=null;
        //head=n.next;
    }
}
