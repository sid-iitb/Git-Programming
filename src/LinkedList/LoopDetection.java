package LinkedList;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class LoopDetection {
    static node head=new LoopedLinkedList().circular();
    public static void main(String args[])
    {
        if(loopdetection2() == 0)
        {
            System.out.println("No Loop");
        }
        else
            System.out.println("Loop Exist");
    }
    static int loopdetection1()
    {
        node h=head;
        while(h != null)
        {
            if(h.flag==1)
            {
                return 1;
            }
            h.flag=1;
            h=h.next;
        }
        return 0;
        
    }
    static int loopdetection2()
    {
        node fast=head;
        node slow=head;
        while(slow != null && fast != null)
        {
            fast=fast.next;
            if(slow==fast)
            {
                return 1;
            }
            if(fast==null)
                return 0;
            fast=fast.next;
            if(slow==fast)
                return 1;
            //fast=fast.next;
            slow=slow.next;
        }
        return 0;
    }
}
