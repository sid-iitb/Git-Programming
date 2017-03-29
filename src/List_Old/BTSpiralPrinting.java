package List_Old;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class BTSpiralPrinting {
    static TreeNode root;
    static void printAtLevel(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else if(level>1)
        {
            printAtLevel(root.left, level-1);
            printAtLevel(root.right, level-1);
        }
    }
    static void printTree(TreeNode node,int depth)
    {
        for(int i=1;i<=depth;i++)
        {
            printAtLevel(node, i);
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        root=BinaryTree.insertadata(root);
        //BinaryTree.inorder(root);
        
        printTree(root,BinaryTree.maxDepth(root));
        
    }
}
