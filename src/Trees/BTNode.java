/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author sidhsaho
 */
public class BTNode<T> {

    T data;
    BTNode left;
    BTNode right;

    public BTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    BTNode getLeftNode(BTNode node) {
        return node.left;
    }

    BTNode getRightNode(BTNode node) {
        return node.right;
    }

    void insertNodeAtLocation(BTNode root, BTNode node) {
        root = node;
    }

    void printInorder(BTNode root) {
        
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print("->" + root.data);
        printInorder(root.right);

    }

    void printPreorder(BTNode root) {
        if (root == null) {
            return;
        }

        System.out.print("->" + root.data);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    void printPostorder(BTNode root) {
        if (root == null) {
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print("->" + root.data);
    }
    
    void printRootToLeafPaths(BTNode root,int path[],int pathlen){
        if(root==null){
            return;
        }
        path[pathlen]=(int) root.data;
        pathlen++;
        if(root.left==null && root.right==null)
        {
            for(int i=0;i<pathlen;i++)
                System.out.print(path[i]+" ");
            System.out.println();
        }
        else{
            printRootToLeafPaths(root.left, path, pathlen);
            printRootToLeafPaths(root.right, path, pathlen);
        }
    }
    
    //number of nodes
    int sizeOfTree(BTNode node)
    {
        if(node==null)
            return 0;
        else
            return sizeOfTree(node.left)+1+sizeOfTree(node.right);
    }
    
    boolean checkIdentical(BTNode node1,BTNode node2)
    {
        if(node1==null && node2==null)
            return true;
        
        if(node1!=null && node2!=null){
            return node1.data.equals(node2.data) && checkIdentical(node1.left, node2.left) && checkIdentical(node1.right, node2.right);
        }
        return false;
    }
    
    //calculate height
    int maximumHeight(BTNode root){
        if(root==null)
            return 0;
        int maxRight=maximumHeight(root.right);
        int maxLeft=maximumHeight(root.left);
        return 1+Math.max(maxLeft, maxRight);
        
    }

}
