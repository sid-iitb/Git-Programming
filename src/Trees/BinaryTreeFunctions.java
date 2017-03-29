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
public class BinaryTreeFunctions {
    public static void main(String args[])
    {
        BTNode root=new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);
        root.left.left = new BTNode(4);
        root.left.right=new BTNode(5);
        System.out.println("Print InOrder Tree");
        root.printInorder(root);
        System.out.println("");
        System.out.println("SIZE OF TREE "+root.sizeOfTree(root));
        System.out.println("MAXIMUM HEIGHT "+root.maximumHeight(root));
        int path[]=new int[10];
        System.out.println("PRINT ROOT TO LEAF");
        root.printRootToLeafPaths(root, path, 0);
        System.out.println("");
        
        BTNode root1=new BTNode(1);
        root1.left = new BTNode(2);
        root1.right = new BTNode(3);
        root1.left.left = new BTNode(4);
        //root1.left.right=new BTNode(5);
        System.out.println("CHECKING IDENTICAL " +root.checkIdentical(root1, root));
        
        
    }
    
    
    
    
}
