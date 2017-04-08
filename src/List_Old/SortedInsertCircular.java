package List_Old;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author sidhartha
 */
public class SortedInsertCircular {
    static node head=LinkList.Main();
    //static node head;
    public static void main(String args[])
    {
        //node head1 = null;
       head.display(head);
       delete$circular();
       head.displaycircular(head);
       //head.length(head);
       // System.out.println("");
       InsertIntoLink(11);
       head.displaycircular(head);
    }
    static void delete$circular()
    {
        if(head!=null){
        head.next.next=head.next.next.next;
        //System.out.println(head.data);
        node df=head;
        while(df.next!=null)
            df=df.next;
        df.next=head;}
    }
    static void InsertIntoLink(int n)
    {
        
        node a=new node(n);
        node current=head;
        //1st case:- empty linked list
        if(current==null)
        {
          head=a;
          a.next=a;
        }
        //2nd case:- AFTER ROOT
        else if(current.data>n)
        {
            while(current.next!=head)
                current=current.next;
            current.next=a;
            a.next=head;
            head=a;
        }
        //3rd case:- else where
        else
        {
            while( current.next != head && current.next.data<n)
            {
                current=current.next;
            }
            a.next=current.next;
            current.next=a;
        }
    }
}
