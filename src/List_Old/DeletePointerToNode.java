/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
import java.io.*;
public class DeletePointerToNode {
        LinkList l=new LinkList();
       static node head=LinkList.Main();
       public static void main(String args[]) throws Exception
       {
           head.display(head);
           head.length(head);
           BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
           delete2(Integer.parseInt(buf.readLine()));
           head.display(head);
                      head.length(head);

       }
       static void delete(int l)
       {
           //if l is not 1 or length(linklist)
           node temp=head;
           node temp2=head;
           while(l>1)
           {
               l=l-1;
               temp=temp.next;
           }
           System.out.println(temp.data);
           node t=temp.next;
           System.out.println(t.data);
           while(temp2.next != temp)
           {
               temp2=temp2.next;
           }
           temp2.next=t;
           System.out.println(temp2.data);
       }
       static void delete2(int l)
       {
           node temp=head;
           //node temp2=head;
           while(l>1)
           {
               l=l-1;
               temp=temp.next;
           }
           //System.out.println(temp.data);
           node t=temp.next.next;
           temp.data=temp.next.data;
           temp.next=t;
           //System.out.println(t.data);
       }
}
