/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class GNodeLinkList {
    static GNode head=null;
    public static void main(String args[])
    {
        insertatbegin(4);
        insertatbegin("dude");
        insertatbegin(8.8);
        insertatbegin('C');
        head.display(head);
    }
    static <R> void insertatbegin(R y)
    {
       // System.out.println("dude");
        GNode<R> n=new<R> GNode(y);
        //n.data=y;
        n.link(head);
        head=n;
       // display();
        //return head;
    }
}
