package LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class BTPrintRootToLeaf {
    static TreeNode root;
    static void printLeaves(TreeNode node,int ar[],int len,int search)
    {
        if(node==null)
            return;
        
        ar[len]=node.data;
        //System.out.println(ar[len]+" ");
        len=len+1;
        if(node.data==search)
        {
            for(int i=0;i<len;i++)
                System.out.print(ar[i]+" ");
            System.out.println("");
            
        }
            //System.out.println(node.data+ " ");
        else
        {
            
            printLeaves(node.left,ar,len,search);
            printLeaves(node.right,ar,len,search);
        }
    }
    static void printit(TreeNode node)
    {
        
    }
 public static void main(String args[])
 {
     root=BinaryTree.insertadata(root);
     //BTSpiralPrinting.printTree(root, BinaryTree.maxDepth(root));
     BinaryTree.printBinaryTree(root, 0);
     System.out.println("");
     int ar[]=new int[1000];
     printLeaves(root,ar,0,4);
     /*for(int i=0;i<1000;i++)
                System.out.print(ar[i]+" ");
            System.out.println("");*/
 }
}
