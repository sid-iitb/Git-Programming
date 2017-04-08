package LinkedList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class SortLinkedList {

    static node head=LinkList.Main();
    LinkList l = new LinkList();

    public static void main(String args[]) {
        head.display(head);
        node.sort(head);
        head.display(head);
    }

    static node sort(node head) {
        node i=head;
        for(; i != null; i=i.next) {
            for(node j = i.next; j != null; j=j.next) {
                if(j.data == i.data) {
                    int temp=j.data;
                    j.data=i.data;
                    i.data=temp;
                }
                //k.data=j.data;
            }
        }
        //head=i;
        return head;

    }
}
