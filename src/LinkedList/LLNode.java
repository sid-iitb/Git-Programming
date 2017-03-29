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
public class LLNode<T> {
    T data;
    LLNode next;
    LLNode prev;

    public LLNode() {
    }
    
    public LLNode(T data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    LLNode insertAtBegin(LLNode root,T data){
        LLNode newNode=new LLNode(data);
        newNode.next = root;
        root=newNode;
        return root;
    }
    void printList(LLNode root){
        LLNode temp = root;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    
    LLNode<T> reverseLL(LLNode root){
        LLNode cu =root,ne,pr = null;
        while(cu!=null){
            ne=cu.next;
            cu.next=pr;
            pr=cu;
            cu=ne;
        }
        root=pr;
        return root;
    }

    LLNode reverseLLRecursive(LLNode root){
        if(root==null||root.next==null)
            return root;
        LLNode rest=reverseLLRecursive(root.next);
        root.next.next=root;
        root.next=null;
        return rest;
    }
    
    boolean palindromCheck(LLNode root){
        return false;
    }
    
    
}
