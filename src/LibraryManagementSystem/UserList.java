/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.util.Date;

/**
 *
 * @author sidhsaho
 */
public class UserList {

    String studentName;
    Date burrowerDate;
    UserList next;

    public UserList(String name, Date d) {
        studentName = name;
        burrowerDate = d;
    }

    int length(UserList head) {
        UserList n;
        int o = 0;
        n = head;
        while (n != null) {
            o = o + 1;
            n = n.next;
        }
        System.out.println("the length is :- " + o);
        return o;
    }
    UserList insertatbegin(UserList head,String studentName, Date burrowerDate)
    {
       // System.out.println("dude");
        UserList n=new UserList(studentName,burrowerDate);
        //n.data=y;
        n.next=head;
        head=n;
        return head;
       // display();
        //return head;
    }
    
    boolean find(UserList head, String studentName)
    {
       UserList n = head; 
       if (head == null) {
           
            return false;
        }
       while (n != null) {
           if(n.studentName.equals(studentName))
               return true;
            n = n.next;
        }
       return false;
    }

    void display(UserList head) {
        UserList n;
        n = head;
        if (head == null) {
            System.exit(0);
            System.out.println("HEAD->NULL");
            return;
        }
        System.out.print("HEAD");
        while (n != null) {
            System.out.print("->" + n.studentName);
            n = n.next;
        }
        System.out.println("->NULL");
        System.out.println();
    }

}
