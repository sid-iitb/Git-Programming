/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author sidhsaho
 */
public class LLFunctions {
    public static void main(String[] args) {
        LLNode root=new LLNode(5);
        root=root.insertAtBegin(root, 0);
        root=root.insertAtBegin(root, 1);
        root=root.insertAtBegin(root, 1);
        root=root.insertAtBegin(root, 0);
        System.out.println("PRINT THE LIST");
        root.printList(root);
        System.out.println("PALINDROM CHECK");
        System.out.println("REVERSE");
        root=root.reverseLL(root);
        root.printList(root);
        System.out.println("REVERSE RECURSIVE");
        root=root.reverseLLRecursive(root);
        root.printList(root);
    }
}
