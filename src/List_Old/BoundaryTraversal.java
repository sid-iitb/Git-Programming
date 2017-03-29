package List_Old;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class BoundaryTraversal {
    static TreeNode root;
 public static void main(String args[]) throws IOException
 {     
     root=BinaryTree.insertadata(root);
     //BinaryTree.printBinaryTree(root, 0);
     root=BinaryTree.insert(root, 1);
     root=BinaryTree.insert(root, 0);
     root=BinaryTree.insert(root, 16);
     //leftuptoleave(root);
     BinaryTree.printBinaryTree(root, 0);
     printBoundaryLeft(root.left);
     leafnodes(root.left);
     leafnodes(root.right);
     printBoundaryRight(root.right);
 }
static void printBoundaryLeft(TreeNode root)
{
    if (root!=null)
    {
        if (root.left!=null)
        {
            // to ensure top down order, print the node
            // before calling itself for left subtree
            System.out.println(root.data);
            printBoundaryLeft(root.left);
        }
        else if( root.right !=null)
        {
            System.out.println(root.data);
            printBoundaryLeft(root.right);
        }
        // do nothing if it is a leaf node, this way we avoid
        // duplicates in output
    }
}
 
 static void printBoundaryRight(TreeNode node)
 {
     if(root!=null)
     {
         if(node.right!=null)
         {             
             printBoundaryRight(node.right);
             System.out.println(node.data);
         }
         else if(node.left!=null)
         {
             printBoundaryRight(node.left);
             System.out.println(node.data);
             
         }
     }
 }
 static void leafnodes(TreeNode node)
 {
     if(node!=null)
     {
         leafnodes(node.left);
         if(node.left==null && node.right==null)
             System.out.println(node.data);
         leafnodes(node.right);
     }
 }
 
}