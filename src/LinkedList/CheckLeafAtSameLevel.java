package LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIDHARTHA
 */
public class CheckLeafAtSameLevel {

    static TreeNode root;

    public static void main(String args[]) {
        root = BinaryTree.insertadata(root);
        //root=BinaryTree.heighbalanced(root);
        //BinaryTree.printBinaryTree(root, 0);
        //System.out.println("\n\n");
        //BinaryTree.insert(root, 81);
        BinaryTree.printBinaryTree(root, 0);
        System.out.println("\n" + BinaryTree.noOfLeaves(root) + "\n\n" + check(root, 0));
    }

    static int check(TreeNode node, int level) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return level + 1;
        }
        return (check(node.left,level+1) == check(node.right,level+1))?1:0;
    }
}
