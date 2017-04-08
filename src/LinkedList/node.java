package LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class node {
     
   node next;
   int data;
   node prev;
   int flag;
   node()
   {
       
   }
   node(int k)
   {
       data=k;
       next=null;
       prev=null;
   }

    static node sort(node head) {
        node i = head;
        for (; i != null; i = i.next) {
            for (node j = i.next; j != null; j = j.next) {
                if (j.data < i.data) {
                    int temp = j.data;
                    j.data = i.data;
                    i.data = temp;
                }
                //k.data=j.data;
            }
        }
        return head;

    }

   void link(node n)
   {
       next=n;
   }

    void previous(node n)
   {
       prev=n;
   }

    int length(node head)
   {
       node n;
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

    node insertatbegin(node head, int y)
    {
       // System.out.println("dude");
        node n=new node(y);
        //n.data=y;
        n.next=head;
        head=n;
        return head;
       // display();
        //return head;
    }

    node insertatbegin(node head, int y, int weight)
    {
       // System.out.println("dude");
        node n=new node(y);
        //n.data=y;
        n.flag=weight;
        n.next=head;
        head=n;
        return head;
       // display();
        //return head;
    }

    node deleteLastNode(node list)
      {
          if(list ==null)
              return list;
          node cur = list.next;
          node pre = list;

while (cur.next != null) {
        pre = cur;
        cur = cur.next;
}

pre.next = null;
return list;
      }

    void display(node head)
    {
        node n;
        n=head;
        if(head==null){
            System.exit(0);
            System.out.println("HEAD->NULL");
            return;}
        System.out.print("HEAD");
        while(n != null)
        {
            System.out.print("->"+n.data);
            n=n.next;
        }
        System.out.println("->NULL");
        System.out.println();
    }
   void display2(node tail)
   {
        node c=tail;
        while(c!=null)
        {
            System.out.print("->"+c.data);
            c=c.prev;
        }
        System.out.println();
   }
   void displaycircular(node head)
   {
       node n;
        n=head;
        System.out.println("CIRCULAR SHOWING TWO LOOPS");
        System.out.print("HEAD");
        while(n.next !=head)
        {
            System.out.print("->"+n.data);
            n=n.next;
        }
        System.out.print("->"+n.data+"->");
        System.out.print("HEAD");
        n=n.next;
        while(n.next!=head)
        {            
            System.out.print("->"+n.data);
            n=n.next;
        }
        System.out.println("->"+n.data+"->HEAD");
   }
}
