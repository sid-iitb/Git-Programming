/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeFlattening;

/**
 *
 * @author sidhsaho
 */
public class MainClass {

    static TreeNode root;

    public static void main(String args[]) {
        //Assuming Binary Search Tree
        
        
        String keyValueA[][] =  {
            {"name","abc"},
            {"id","5"},
            {"place","Tirupati"}
        };
        String keyValueB[][] =  {
            {"id","24"},
            {"name","efg"}
        };
        String keyValueC[][] =  {
            {"name","xyz"}
        };
        String keyValueD[][] =  {
            {"place","Bangalore"},
            {"job","SE"}
        };
        String keyValueE[][] =  {
            {"id","34"}
        };
        
        
        root = TreeInsertion.insertToTree(root,"A", keyValueA);
        root = TreeInsertion.insertToTree(root,"D", keyValueB);
        root = TreeInsertion.insertToTree(root,"C", keyValueC);
        root = TreeInsertion.insertToTree(root,"E", keyValueD);
        root = TreeInsertion.insertToTree(root,"B", keyValueE);
        //root = TreeInsertion.insertToTree(root,"B", keyValueE);
        TreeInsertion.printBinaryTree(root, 0);
        TreeFindNode.TreeFindNode(root, "A");
        TreeFindNode.TreeFindNode(root, "B");
        TreeFindNode.TreeFindNode(root, "C");
        TreeFindNode.TreeFindNode(root, "D");
        TreeFindNode.TreeFindNode(root, "E");
        //System.out.println(TreeInsertion.nodesName.get("A"));
    }
}
